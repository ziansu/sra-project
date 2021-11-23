@org.junit.Test
public void testProp() {
    final org.springframework.context.support.ClassPathXmlApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext(new java.lang.String[]{ "classpath*:core-context.xml" });
    context.registerShutdownHook();
    context.start();
    java.lang.System.out.println(context.getBeanFactory().resolveEmbeddedValue("${test}"));
    java.lang.System.out.println(context.getBeanFactory().resolveEmbeddedValue("${dxf}"));
    context.close();
}