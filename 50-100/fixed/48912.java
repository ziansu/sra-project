@org.springframework.context.annotation.Bean
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(name = "endpoint.autoinit", matchIfMissing = true)
public org.springframework.boot.web.servlet.ServletRegistrationBean cxfDispatcherServlet() {
    org.springframework.boot.web.servlet.ServletRegistrationBean servletRegistrationBean = new org.springframework.boot.web.servlet.ServletRegistrationBean(new org.apache.cxf.transport.servlet.CXFServlet(), ((baseUrl) + "/*"));
    java.util.Map<java.lang.String, java.lang.String> initParameters = servletRegistrationBean.getInitParameters();
    initParameters.put("service-list-title", serviceListTitle);
    return servletRegistrationBean;
}