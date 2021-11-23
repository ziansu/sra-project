@org.junit.Test
public void testFactoryBeanReturnsNull() throws java.lang.Exception {
    org.springframework.beans.factory.support.DefaultListableBeanFactory factory = new org.springframework.beans.factory.support.DefaultListableBeanFactory();
    new org.springframework.beans.factory.xml.XmlBeanDefinitionReader(factory).loadBeanDefinitions(org.springframework.beans.factory.FactoryBeanTests.RETURNS_NULL_CONTEXT);
    java.lang.Object result = factory.getBean("factoryBean");
    org.junit.Assert.assertNull(result);
}