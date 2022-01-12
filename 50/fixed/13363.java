public void destroyObject(java.lang.Object obj) {
    if (obj == null)
        return ;
    
    java.lang.Thread thread = ((java.lang.Thread) (obj));
    synchronized(thread) {
        thread.interrupt();
    }
    thread = null;
}