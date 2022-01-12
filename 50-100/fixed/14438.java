private void endTransaction(boolean callerIsBatch) {
    com.android.providers.contacts.ContactsTransaction transaction = mTransactionHolder.get();
    if ((transaction != null) && ((!(transaction.isBatch())) || callerIsBatch)) {
        try {
            if (transaction.isDirty()) {
                notifyChange();
            }
            transaction.finish(callerIsBatch);
        } finally {
            mTransactionHolder.set(null);
        }
    }
}