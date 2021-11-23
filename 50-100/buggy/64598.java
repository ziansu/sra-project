public static void main(java.lang.String[] args) {
    org.springframework.boot.SpringApplication.run(com.web.app.WebappServerApplication.class, args);
    java.lang.String log4jPath = (com.web.app.WebappServerApplication.class.getClassLoader().getResource("").getPath()) + "/log4j.properties";
    org.apache.log4j.PropertyConfigurator.configure(log4jPath);
    com.web.app.WebappServerApplication.logger.info("Setup Server");
}