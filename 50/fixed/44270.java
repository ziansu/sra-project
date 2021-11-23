private void cleanUp() {
    org.osgl.aaa.AAAContext ctxt = org.osgl.aaa.AAA.context();
    ctxt.setGuardedTarget(null);
    ctxt.setCurrentPrincipal(null);
    org.osgl.aaa.AAA.setContext(null);
}