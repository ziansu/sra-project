@java.lang.SuppressWarnings(value = "unchecked")
@org.junit.Before
public void init() {
    this.ctx = new org.springframework.context.support.ClassPathXmlApplicationContext("classpath:metered-interface-impl.xml");
    this.metricRegistry = this.ctx.getBean(com.codahale.metrics.MetricRegistry.class);
    this.meteredClass = ((com.ryantenney.metrics.spring.MeteredClassImpementsInterfaceTest.MeteredClassInterface<java.lang.Object, java.lang.Object>) (this.ctx.getBean("metered-class-interface")));
}