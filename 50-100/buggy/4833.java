public final void beginTransaction(boolean write) {
    if ((inTransaction()) && ((!write) || (!(mDb.isReadOnly()))))
        return ;
    
    if (write)
        openWrite();
    else
        openRead();
    
    if (inTransaction())
        mDb.beginTransaction();
    
}