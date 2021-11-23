@org.junit.Test
public void testStatefulPrototypeKieSession() throws java.lang.Exception {
    org.kie.api.runtime.KieSession ksession = ((org.kie.api.runtime.KieSession) (org.kie.spring.tests.KieSpringScopeTest.context.getBean("statefulPrototypeSession")));
    org.junit.Assert.assertNotNull(ksession);
    org.kie.api.runtime.KieSession anotherKsession = ((org.kie.api.runtime.KieSession) (org.kie.spring.tests.KieSpringScopeTest.context.getBean("statefulPrototypeSession")));
    org.junit.Assert.assertNotNull(anotherKsession);
    org.junit.Assert.assertNotEquals(ksession.hashCode(), anotherKsession.hashCode());
}