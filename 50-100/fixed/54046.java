public void endGame() {
    if (end)
        return ;
    
    OBME.close();
    OBMO.close();
    objects.clearAll();
    OBME = null;
    OBMO = null;
    objects = null;
    sdk = null;
    OIR = null;
    view = null;
    end = true;
    java.lang.System.gc();
}