public void delete(final org.lmdbjava.Txn<T> txn, final T key) {
    delete(txn, key, null);
}