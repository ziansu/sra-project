@java.lang.Override
public void setTransaction(suneido.intfc.database.Transaction tran) {
    if ((this.tran) == tran)
        return ;
    
    this.tran = tran;
    if (tran == null)
        return ;
    
    set_ix();
    if ((iter) != null)
        iter = tran.iter(tbl.num(), icols, iter);
    
}