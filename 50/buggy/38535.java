public static org.osgl.aaa.spring.web.AAAContext getAAAContext() {
    if (null == (org.osgl.aaa.spring.web.AAAConfigurer.ctxt)) {
        org.osgl.aaa.spring.web.AAAConfigurer.ctxt = new org.osgl.aaa.impl.SimpleAAAContext(org.osgl.aaa.spring.web.AAAConfigurer.authen, org.osgl.aaa.spring.web.AAAConfigurer.author, org.osgl.aaa.spring.web.AAAConfigurer.db, org.osgl.aaa.spring.web.AAAConfigurer.superUser, (org.osgl.aaa.spring.web.AAAConfigurer.allowSystem ? org.osgl.aaa.spring.web.AAAConfigurer.systemPrincipal : null), org.osgl.aaa.spring.web.AAAConfigurer.allowSystem);
    }
    return org.osgl.aaa.spring.web.AAAConfigurer.ctxt;
}