private static int calcTaskLen() {
    int maxSizePossible = 10000;
    int objectSize = 4;
    if (net.tridentsdk.server.threads.ConcurrentTaskExecutor.ARCH_64)
        objectSize = 8;
    
    int len;
    long max = ((java.lang.Runtime.getRuntime().freeMemory()) / objectSize) / 15;
    if (max > ((long) (maxSizePossible)))
        len = net.tridentsdk.server.threads.ConcurrentTaskExecutor.maxSizePossible();
    else
        len = ((int) (max));
    
    return len;
}