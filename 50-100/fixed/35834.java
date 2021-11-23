private boolean acquireLock(java.lang.String nodeName, byte magic) throws java.lang.Exception {
    this.magic = magic;
    if (nodeName == null)
        this.nodeName = createNode();
    
    boolean result;
    while (!(result = isAcquired())) {
        condition.wait();
    } 
    return result;
}