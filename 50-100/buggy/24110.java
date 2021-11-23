@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    final im.ene.lab.wordy.result.ResultItem item = parent.getItem(position);
    final im.ene.lab.wordy.result.ResultItem resultItem = mRealm.where(im.ene.lab.wordy.result.ResultItem.class).equalTo(ResultItem.KEY_CREATED_AT, item.createdAt).findFirst();
    if (resultItem != null) {
        mRealm.executeTransaction(new io.realm.Realm.Transaction() {
            @java.lang.Override
            public void execute(io.realm.Realm realm) {
                resultItem.removeFromRealm();
            }
        });
    }
}