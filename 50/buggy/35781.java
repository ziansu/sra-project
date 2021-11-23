public synchronized java.lang.Object get() throws java.lang.InterruptedException {
    while (buffer.isEmpty())
        wait();
    
    java.lang.Object obj = buffer.remove(0);
    return obj;
}