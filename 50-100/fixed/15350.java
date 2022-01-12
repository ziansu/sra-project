@java.lang.Override
public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
    super.init(config);
    try (org.springframework.context.ConfigurableApplicationContext appCtx = new org.springframework.context.support.ClassPathXmlApplicationContext("spring/spring-app.xml")) {
        java.lang.System.out.println(("Bean definition names: " + (java.util.Arrays.toString(appCtx.getBeanDefinitionNames()))));
        java.lang.System.out.println("\n\n\n");
        mealRestController = appCtx.getBean(ru.javawebinar.topjava.web.meal.MealRestController.class);
        mealRestController.getAll().forEach(java.lang.System.out::println);
        java.lang.System.out.println("\n\n\n");
    }
}