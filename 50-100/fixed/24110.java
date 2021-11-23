@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    final im.ene.lab.wordy.result.ResultItem item = parent.getItem(position);
    mRealm.executeTransaction(new io.realm.Realm.Transaction() {
        @java.lang.Override
        public void execute(io.realm.Realm realm) {
            item.removeFromRealm();
        }
    });
}