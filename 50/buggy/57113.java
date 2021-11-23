@java.lang.SuppressWarnings(value = "resource")
public static void main(java.lang.String[] args) {
    org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("spring/application-config.xml");
    com.bionic.edu.Application application = ((com.bionic.edu.Application) (context.getBean("application")));
    application.addMerchant();
}