private static java.lang.String getDIM(java.util.ArrayList<pt.ua.dicoogle.sdk.datastructs.SearchResult> allresults) {
    try {
        pt.ua.dicoogle.core.dim.DIMGeneric dimModel = new pt.ua.dicoogle.core.dim.DIMGeneric(allresults);
        return dimModel.getJSON();
    } catch (java.lang.Exception e) {
        org.slf4j.LoggerFactory.getLogger(pt.ua.dicoogle.server.web.servlets.search.SearchServlet.class).warn("failed to get DIM", e);
        return "";
    }
}