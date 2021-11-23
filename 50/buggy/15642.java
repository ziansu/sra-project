public static void main(java.lang.String[] args) {
    org.springframework.boot.SpringApplication springApplication = new org.springframework.boot.SpringApplication(tutorial.Application.class);
    springApplication.setAdditionalProfiles("dev", "hsqldb");
    springApplication.run(args);
}