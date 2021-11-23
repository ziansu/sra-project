@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    final im.ene.lab.wordy.result.ResultItem item = parent.getItem(position);
    parent.removeItem(item);
    mRealm.executeTransaction(new io.realm.Realm.Transaction() {
        @java.lang.Override
        public void execute(io.realm.Realm realm) {
            io.realm.RealmResults<im.ene.lab.wordy.result.ResultItem> items = realm.where(im.ene.lab.wordy.result.ResultItem.class).equalTo(ResultItem.KEY_CREATED_AT, item.createdAt).findAll();
            if (!(im.ene.lab.wordy.utils.Utils.isEmpty(items))) {
                items.clear();
            }
        }
    });
}