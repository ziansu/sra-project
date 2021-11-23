@java.lang.Override
public void initialize(org.springframework.context.ConfigurableApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
    org.springframework.core.env.Environment env = applicationContext.getEnvironment();
    java.lang.String scan = env.getProperty("spring.dubbo.scan");
    if (scan != null) {
        com.alibaba.dubbo.config.spring.AnnotationBean scanner = ((com.alibaba.dubbo.config.spring.AnnotationBean) (registerAndInstance(scan)));
        scanner.setPackage(scan);
        scanner.setApplicationContext(applicationContext);
        applicationContext.addBeanFactoryPostProcessor(scanner);
        applicationContext.getBeanFactory().addBeanPostProcessor(scanner);
    }
}