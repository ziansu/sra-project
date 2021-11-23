public void waitMatch() throws java.lang.InterruptedException {
    for (int i = 0; i < (readers.length); i++)
        readers[i].waitMatch();
    
}