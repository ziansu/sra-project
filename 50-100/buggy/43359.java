@java.lang.Override
public void execute(io.realm.Realm realm) {
    io.realm.RealmResults<ink.va.models.MessageModel> messageModels = realm.where(ink.va.models.MessageModel.class).equalTo("userId", currentUserId).equalTo("opponentId", opponentId).or().equalTo("opponentId", currentUserId).equalTo("userId", opponentId).findAll();
    messageModels.deleteAllFromRealm();
    deleteCallback.onSuccess(null);
}