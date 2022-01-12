public static void main(java.lang.String[] args) {
    java.lang.String[] as = new java.lang.String[]{ "-pattern" , "low income families" , "-window" , "0" , "-format" , "text" , "/Users/will/Dropbox/blogposts/speeches" };
    org.conjugateprior.ca.app.Concordancer cc = new org.conjugateprior.ca.app.Concordancer();
    org.conjugateprior.ca.app.CLConcordancer c = new org.conjugateprior.ca.app.CLConcordancer(cc);
    try {
        c.processLine(as);
    } catch (java.lang.Exception ex) {
        java.lang.System.err.println(ex.getMessage());
        c.printUsageAndOptions();
    }
}