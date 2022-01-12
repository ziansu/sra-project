@org.junit.Test
public void test() {
    context = new org.springframework.context.support.ClassPathXmlApplicationContext("combined/combined.xml", "combined/combined-aop1.xml", "combined/combined-aop3.xml");
    testImpl();
}