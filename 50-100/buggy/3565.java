private void checkFiles() {
    try {
        if (!(log.exists()))
            log.createNewFile();
        
        if (!(resp.exists()))
            resp.createNewFile();
        
    } catch (java.io.IOException e) {
        g.printError(e);
    }
}