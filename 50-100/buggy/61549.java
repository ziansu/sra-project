public static java.lang.String clean(java.lang.String URL) {
    try {
        return ca.concordia.cs.aseg.segps.ontologies.urigenerator.utils.URLCleaner.clean_simple_safe(URL);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.print((("Error at URLCleaner.clean(): " + URL) + (ex.getMessage())));
        return ca.concordia.cs.aseg.segps.ontologies.urigenerator.utils.URLCleaner.clean_simple_safe(URL);
    }
}