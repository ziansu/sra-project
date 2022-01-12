public java.lang.String renderJspAsString(java.lang.String viewName, java.util.Map<java.lang.String, java.lang.Object> model, javax.servlet.http.HttpServletRequest request) {
    org.springframework.mock.web.MockHttpServletResponse resp = new org.springframework.mock.web.MockHttpServletResponse();
    try {
        org.springframework.web.servlet.View view = resolver.resolveViewName(viewName, java.util.Locale.getDefault());
        view.render(model, request, resp);
        return resp.getContentAsString();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}