public void waitFor() throws java.lang.InterruptedException {
    command.process.waitFor();
    if (!(command.daemon))
        for (int i = 0; i < (readers.length); i++)
            readers[i].waitFor(10000);
        
    
}