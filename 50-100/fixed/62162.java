private void limitUpdateDuration() {
    if (exclusive)
        return ;
    
    while (true) {
        suneido.immudb.UpdateTransaction t = null;
        synchronized(this) {
            if (utrans.isEmpty())
                return ;
            
            t = utrans.peek();
            if ((t.stopwatch.elapsed(java.util.concurrent.TimeUnit.SECONDS)) < (suneido.immudb.Transactions.MAX_UPDATE_TRAN_DURATION_SEC))
                return ;
            
        }
        suneido.immudb.Transactions.abort(t, (("update transaction longer than " + (suneido.immudb.Transactions.MAX_UPDATE_TRAN_DURATION_SEC)) + " seconds"));
    } 
}