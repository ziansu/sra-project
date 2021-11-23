public void endGame() {
    OBME.close();
    OBMO.close();
    objects.clearAll();
    OBME = null;
    OBMO = null;
    objects = null;
    sdk = null;
    OIR = null;
    view = null;
    java.lang.System.gc();
}