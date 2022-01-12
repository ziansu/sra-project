private void errorOnInit(java.lang.Exception e) {
    java.lang.System.err.println(("Anthrazit error: " + (e.toString())));
    if (io.github.smclt30p.anthrazit.Logger.debug) {
        e.printStackTrace();
    }
    if (io.github.smclt30p.anthrazit.Logger.exitOnFatal) {
        java.lang.System.err.println("Anthrazit exit on fatal: Bailing...");
        close();
        java.lang.System.exit(1);
    }
}