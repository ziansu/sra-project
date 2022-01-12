@java.lang.Override
public void onStartup(javax.servlet.ServletContext servletContext) throws javax.servlet.ServletException {
    org.springframework.web.filter.CharacterEncodingFilter characterEncodingFilter = new org.springframework.web.filter.CharacterEncodingFilter();
    characterEncodingFilter.setEncoding("UTF-8");
    characterEncodingFilter.setForceEncoding(true);
    super.onStartup(servletContext);
}