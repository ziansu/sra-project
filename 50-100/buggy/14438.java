private void endTransaction(boolean callerIsBatch) {
    com.android.providers.contacts.ContactsTransaction transaction = mTransactionHolder.get();
    if ((transaction != null) && ((!(transaction.isBatch())) || callerIsBatch)) {
        if (transaction.isDirty()) {
            notifyChange();
        }
        transaction.finish(callerIsBatch);
        mTransactionHolder.set(null);
    }
}