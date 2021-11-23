@org.springframework.web.bind.annotation.RequestMapping(value = "/search", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = de.weltraumschaf.maconha.core.ServedContentTypes.APPLICATION_JSON)
public java.util.Collection<de.weltraumschaf.maconha.model.MediaFile> index(final javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.RequestParam(value = "q")
final java.lang.String query, @org.springframework.web.bind.annotation.RequestParam(name = "type[]", defaultValue = "")
final java.lang.String[] types) {
    tracer.traceRequest(request);
    de.weltraumschaf.maconha.frontend.search.controller.SearchController.LOGGER.debug("Search q={} type={}", query, types);
    return search.forKeywords(sanitizeQuery(query), sanitizeTypes(java.util.Arrays.asList(types)));
}