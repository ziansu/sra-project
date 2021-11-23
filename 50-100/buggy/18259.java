@org.junit.Test
public void test() throws javax.naming.NamingException {
    java.lang.String jndiName = "ejb:/wildfly-ejb-ssl/HelloEjbStateless!org.ktest.study.javaee.ejb.HelloEjbStateless";
    org.ktest.study.javaee.ejb.HelloEjbStateless hello = ((org.ktest.study.javaee.ejb.HelloEjbStateless) (javax.naming.InitialContext.doLookup(jndiName)));
    java.lang.String expectedText = "Hello World! Welcome to Stateless EJB!";
    java.lang.String actualText = hello.sayHello("World");
    assertEquals(expectedText, actualText);
}