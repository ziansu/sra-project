public static void main(java.lang.String[] args) {
    java.lang.System.getProperties().put("server.port", 8085);
    org.springframework.context.ApplicationContext ctx = org.springframework.boot.SpringApplication.run(org.fundacionjala.sevenwonders.ui.Application.class, args);
}