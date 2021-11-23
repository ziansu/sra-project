private synchronized void checkComplete() {
    if (isDone())
        return ;
    
    if ((err) != null)
        onDone(false, err);
    
    if (!(hasPending()))
        onDone(true);
    
}