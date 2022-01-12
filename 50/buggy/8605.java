public void setCurrentTransaction(final com.media2359.nickel.model.NickelTransfer currentTransaction) {
    final com.media2359.nickel.model.Recipient object = this;
    io.realm.Realm realm = io.realm.Realm.getDefaultInstance();
    realm.executeTransaction(new io.realm.Realm.Transaction() {
        @java.lang.Override
        public void execute(io.realm.Realm realm) {
            object.currentTransaction = currentTransaction;
        }
    });
}