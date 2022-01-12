private synchronized void checkComplete() {
    if (isDone())
        return ;
    
    if ((err) != null)
        onDone(err);
    
    if (!(hasPending()))
        onDone(true);
    
}