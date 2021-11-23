private static org.springframework.web.context.WebApplicationContext getContext() {
    org.springframework.web.context.support.XmlWebApplicationContext context = new org.springframework.web.context.support.XmlWebApplicationContext();
    context.setConfigLocations("classpath:spark-itcase-servlet.xml");
    context.start();
    return context;
}