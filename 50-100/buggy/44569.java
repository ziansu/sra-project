void cancel() {
    if (canceled)
        return ;
    
    canceled = true;
    for (int i = 0; i < (results.length()); i++) {
        org.apache.ignite.internal.processors.query.h2.twostep.GridMapQueryExecutor.QueryResult res = results.get(i);
        if (res != null) {
            res.close();
            org.apache.ignite.internal.processors.query.GridQueryCancel cancel = cancels[i];
            if (cancel != null)
                cancel.cancel();
            
        }
    }
}