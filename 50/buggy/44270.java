private void cleanUp() {
    org.osgl.aaa.AAAContext ctxt = org.osgl.aaa.spring.web.AAAConfigurer.getAAAContext();
    ctxt.setGuardedTarget(null);
    ctxt.setCurrentPrincipal(null);
    org.osgl.aaa.AAA.setContext(null);
}