protected server.RMItem removeData(int id, java.lang.String key) {
    server.RMHashtable t = transaction_table.get(new java.lang.Integer(id));
    synchronized(t) {
        lastTransactionActivityTime.put(new java.lang.Integer(id), new java.lang.Long(java.lang.System.currentTimeMillis()));
        isTransactionModified.put(new java.lang.Integer(id), new java.lang.Boolean(true));
        return ((server.RMItem) (t.remove(key)));
    }
}