public void doGet(final javax.servlet.http.HttpServletRequest pReq, final javax.servlet.http.HttpServletResponse pRes) throws java.io.IOException {
    java.lang.System.out.println(("Annotations for page: " + (pReq.getParameter("uri"))));
    java.util.List<com.hp.hpl.jena.rdf.model.Model> tAnnotations = _store.getAnnotationsFromPage(pReq.getParameter("uri"));
    java.util.List tAnnotationList = _annotationUtils.createAnnotationList(tAnnotations);
    pRes.setContentType("application/ld+json");
    java.lang.System.out.println(com.github.jsonldjava.utils.JsonUtils.toPrettyString(tAnnotationList));
    pRes.getOutputStream().println(com.github.jsonldjava.utils.JsonUtils.toPrettyString(tAnnotationList));
}