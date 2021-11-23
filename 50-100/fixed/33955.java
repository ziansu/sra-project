@java.lang.Override
public void deployConfig(org.springframework.web.context.WebApplicationContext cxt) {
    this.context = this.tomcatServer.addContext("", java.lang.System.getProperty("java.io.tmpdir"));
    org.apache.catalina.startup.Tomcat.addServlet(context, "dispatcherServlet", new org.springframework.web.servlet.DispatcherServlet(cxt));
    this.context.addServletMapping("/", "dispatcherServlet");
}