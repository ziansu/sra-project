public static void initializeProcessGlobals() {
    if ((be.mayeur.home.homemon.main.processGlobalsRun) == false) {
        be.mayeur.home.homemon.main.processGlobalsRun = true;
        try {
            be.mayeur.home.homemon.main._process_globals();
            httputils2service._process_globals();
            statemanager._process_globals();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}