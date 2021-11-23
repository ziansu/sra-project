public static void main(java.lang.String[] args) {
    org.springframework.context.ConfigurableApplicationContext ctx = org.springframework.boot.SpringApplication.run(se.uu.it.runestone.teamone.Application.class, args);
    se.uu.it.runestone.teamone.Server server = new se.uu.it.runestone.teamone.Server();
    server.run();
}