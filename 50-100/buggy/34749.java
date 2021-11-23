@java.lang.Override
public void setTransaction(suneido.intfc.database.Transaction tran) {
    this.tran = tran;
    if (((this.tran) == tran) || (tran == null))
        return ;
    
    set_ix();
    if ((iter) != null)
        iter = tran.iter(tbl.num(), icols, iter);
    
}