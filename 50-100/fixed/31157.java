protected server.RMItem removeData(int id, java.lang.String key) {
    server.RMHashtable t = transaction_table.get(new java.lang.Integer(id));
    synchronized(t) {
        isTransactionModified.put(new java.lang.Integer(id), new java.lang.Boolean(true));
        return ((server.RMItem) (t.remove(key)));
    }
}