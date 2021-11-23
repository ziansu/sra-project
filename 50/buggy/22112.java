public synchronized geogebra.cas.CASgeneric getCurrentCAS() {
    if ((cas) == null) {
        java.lang.Thread casIniting = new java.lang.Thread() {
            public void run() {
                setCurrentCAS(Kernel.DEFAULT_CAS);
            }
        };
        casIniting.start();
    }
    return cas;
}