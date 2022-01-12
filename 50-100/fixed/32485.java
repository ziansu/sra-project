@com.epimorphics.lda.restlets.GET
public com.epimorphics.lda.restlets.Response requestHandlerAny(@com.epimorphics.lda.restlets.PathParam(value = "path")
java.lang.String pathstub, @com.epimorphics.lda.restlets.Context
javax.servlet.ServletContext config, @com.epimorphics.lda.restlets.Context
com.epimorphics.lda.restlets.UriInfo ui) {
    try {
        com.epimorphics.lda.restlets.ControlRestlet.SpecRecord rec = com.epimorphics.lda.restlets.ControlRestlet.lookupRequest(config, pathstub, ui);
        java.lang.String stub = (rec == null) ? "" : pathstub;
        return new com.epimorphics.lda.restlets.ConfigRestlet().generateConfigPage(stub, config, ui);
    } catch (java.lang.RuntimeException e) {
        java.lang.System.err.println("OOPS");
        throw new java.lang.RuntimeException(e);
    }
}