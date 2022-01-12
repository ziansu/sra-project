public boolean equals(java.lang.Object tid) {
    if (!(tid instanceof simpledb.TransactionId))
        return false;
    
    return (((simpledb.TransactionId) (tid)).myid) == (myid);
}