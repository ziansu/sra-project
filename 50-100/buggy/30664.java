private java.lang.Object getrec(java.lang.Object arg, suneido.database.query.Query.Dir dir) {
    if (!(arg instanceof suneido.runtime.builtin.SuTransaction))
        throw new suneido.SuException("usage: cursor.Next/Prev(transaction)");
    
    suneido.database.server.DbmsTran t = ((suneido.runtime.builtin.SuTransaction) (arg)).getTransaction();
    q.setTransaction(t);
    return super.getrec(dir, t);
}