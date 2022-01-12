public static void main(java.lang.String[] args) {
    org.conjugateprior.ca.app.Concordancer cc = new org.conjugateprior.ca.app.Concordancer();
    org.conjugateprior.ca.app.CLConcordancer c = new org.conjugateprior.ca.app.CLConcordancer(cc);
    try {
        c.processLine(args);
    } catch (java.lang.Exception ex) {
        java.lang.System.err.println(ex.getMessage());
        c.printUsageAndOptions();
    }
}