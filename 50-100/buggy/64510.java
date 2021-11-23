private java.lang.String getContext(eu.clarin.cmdi.vlo.importer.Pattern path, java.util.Map<eu.clarin.cmdi.vlo.importer.Pattern, java.lang.String> pathConceptLinkMapping) {
    java.lang.String context = null;
    java.lang.String cpath = path.getPattern();
    while ((context == null) && (!(cpath.equals("/text()")))) {
        cpath = cpath.replaceAll("/[^/]*/text\\(\\)", "/text()");
        context = pathConceptLinkMapping.get(cpath);
    } 
    return context;
}