public boolean delete(final org.lmdbjava.Txn<T> txn, final T key) {
    return delete(txn, key, null);
}