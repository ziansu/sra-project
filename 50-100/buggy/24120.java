public boolean commitToTransaction(java.util.ArrayList<Transaction.TransactionManager.transaction> opBuffer) {
    for (Transaction.TransactionManager.transaction op : opBuffer) {
        switch (op.getCommand()) {
            case INSERT :
                insertToMemory(op.getTableName(), ((MemoryManager.Record) (op.getValue())));
                break;
            case DELETE_TABLE :
                deleteTable(op.getTableName());
                break;
        }
    }
    return false;
}