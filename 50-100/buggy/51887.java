private void addServletMapping(javax.servlet.ServletContext context) {
    javax.servlet.ServletRegistration defaultServletRegistration = context.getServletRegistration("default");
    defaultServletRegistration.addMapping("/favicon.ico", "/static/*", "/index.html");
    javax.servlet.ServletRegistration jspServletRegistration = context.getServletRegistration("jsp");
    jspServletRegistration.addMapping("/dynamic/jsp/*");
    javax.servlet.ServletRegistration uploadServletRegistration = context.getServletRegistration("upload");
    uploadServletRegistration.addMapping("/upload.do");
}