@java.lang.Override
public void onStartup(javax.servlet.ServletContext servletContext) throws javax.servlet.ServletException {
    super.onStartup(servletContext);
    javax.servlet.FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("encoding-filter", new org.springframework.web.filter.CharacterEncodingFilter());
    encodingFilter.setInitParameter("encoding", "UTF-8");
    encodingFilter.setInitParameter("forceEncoding", "true");
    encodingFilter.addMappingForUrlPatterns(null, true, "/*");
}