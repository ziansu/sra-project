public synchronized void waitMatch() throws java.lang.InterruptedException {
    for (int i = 0; i < (readers.length); i++)
        if ((readers[i]) != null)
            readers[i].waitMatch();
        
    
}