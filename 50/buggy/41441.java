public static void main(java.lang.String[] args) {
    org.springframework.boot.SpringApplication.run(com.greenfox.foxclub.MainApplication.class, args);
    org.springframework.context.annotation.AnnotationConfigApplicationContext ctx = new org.springframework.context.annotation.AnnotationConfigApplicationContext(com.greenfox.foxclub.configuration.FoxConfig.class);
    com.greenfox.foxclub.models.Fox fox = ctx.getBean(com.greenfox.foxclub.models.Fox.class);
}