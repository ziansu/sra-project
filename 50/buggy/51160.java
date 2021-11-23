synchronized void add(suneido.intfc.database.Transaction t) {
    if (t instanceof suneido.immudb.UpdateTransaction) {
        if (exclusive)
            throw new suneido.SuException("blocked by exclusive transaction");
        
        utrans.add(((suneido.immudb.UpdateTransaction) (t)));
    }
    trans.add(t);
}