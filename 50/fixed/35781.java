public synchronized java.lang.Object get() throws java.lang.InterruptedException {
    while (buffer.isEmpty())
        wait();
    
    return buffer.remove(0);
}