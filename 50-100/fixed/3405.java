private void writeData(int id, java.lang.String key, server.RMItem value) {
    server.RMHashtable t = transaction_table.get(new java.lang.Integer(id));
    synchronized(t) {
        t.put(key, value);
        isTransactionModified.put(new java.lang.Integer(id), new java.lang.Boolean(true));
    }
}