protected org.codehaus.groovy.grails.web.sitemesh.GrailsContentBufferingResponse createContentBufferingResponse(java.util.Map<java.lang.String, java.lang.Object> model, org.codehaus.groovy.grails.web.servlet.mvc.GrailsWebRequest webRequest, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    return new org.codehaus.groovy.grails.web.sitemesh.GrailsViewBufferingResponse(request, response, webRequest.getServletContext());
}