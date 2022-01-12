public void waitFor() throws java.lang.InterruptedException {
    command.process.waitFor();
    if (!(command.daemon))
        synchronized(this) {
            for (int i = 0; i < (readers.length); i++)
                if ((readers[i]) != null)
                    readers[i].waitFor(10000);
                
            
        }
    
}