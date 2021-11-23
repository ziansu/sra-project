@org.junit.Test
public void testStatelessSingletonKieSession() throws java.lang.Exception {
    org.kie.api.runtime.StatelessKieSession ksession = ((org.kie.api.runtime.StatelessKieSession) (org.kie.spring.tests.KieSpringScopeTest.context.getBean("statelessSingletonSession")));
    assertNotNull(ksession);
    org.kie.api.runtime.StatelessKieSession anotherKsession = ((org.kie.api.runtime.StatelessKieSession) (org.kie.spring.tests.KieSpringScopeTest.context.getBean("statelessSingletonSession")));
    assertNotNull(anotherKsession);
    assertEquals(ksession.hashCode(), anotherKsession.hashCode());
}