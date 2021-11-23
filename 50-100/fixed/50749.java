public static void main(java.lang.String[] args) {
    org.springframework.context.ApplicationContext ctx = org.springframework.boot.SpringApplication.run(pl.edu.pw.elka.pik.PikApplication.class, args);
    java.lang.System.out.println("Let's inspect the beans provided by Spring Boot:");
    java.lang.String[] beanNames = ctx.getBeanDefinitionNames();
    java.util.Arrays.sort(beanNames);
    for (java.lang.String beanName : beanNames) {
        java.lang.System.out.println(beanName);
    }
}