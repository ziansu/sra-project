public java.lang.String renderJspAsString(java.lang.String viewName, java.util.Map<java.lang.String, java.lang.Object> model, javax.servlet.http.HttpServletRequest request) {
    org.springframework.mock.web.MockHttpServletResponse resp = new org.springframework.mock.web.MockHttpServletResponse();
    try {
        java.lang.System.out.println(viewName);
        java.lang.System.out.println(("resolver " + (resolver)));
        org.springframework.web.servlet.View view = resolver.resolveViewName(viewName, java.util.Locale.getDefault());
        view.render(model, request, resp);
        return resp.getContentAsString();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}