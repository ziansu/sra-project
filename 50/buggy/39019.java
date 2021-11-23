public static void main(java.lang.String[] args) throws java.io.IOException {
    org.springframework.boot.SpringApplication.run(org.ua.deth.javamailsender.init.JavaMailSenderApplication.class, args);
    org.ua.deth.javamailsender.init.OpenUrlOnStartUp.openUrl();
    new org.ua.deth.javamailsender.config.DirectoryConfig().getHome();
}