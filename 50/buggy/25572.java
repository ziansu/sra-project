public static void main(java.lang.String[] args) {
    org.springframework.boot.SpringApplication springApplication = new org.springframework.boot.SpringApplication(com.xiaojiuwo.Application.class);
    springApplication.addListeners(new org.springframework.boot.actuate.system.ApplicationPidFileWriter());
    springApplication.run(args);
    EurekaServerConfiguration = $missing$;
}