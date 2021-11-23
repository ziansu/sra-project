public static void main(java.lang.String[] args) {
    org.springframework.context.ApplicationContext ctx = org.springframework.boot.SpringApplication.run(com.joeldholmes.SacredTextApiApplication.class, args);
    com.netflix.hystrix.HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(5000);
}