private boolean acquireLock(java.lang.String nodeName, byte magic) throws java.lang.Exception {
    this.magic = magic;
    if (nodeName == null)
        this.nodeName = nodeName = createNode();
    
    boolean result;
    while (!(result = isAcquired())) {
        synchronized(condition) {
            condition.wait();
        }
    } 
    return result;
}