private void checkFiles() {
    try {
        if (!(log.exists()))
            log.createNewFile();
        
        if (!(resp.exists()))
            resp.createNewFile();
        
    } catch (java.lang.Throwable t) {
        g.printError(t);
    }
}