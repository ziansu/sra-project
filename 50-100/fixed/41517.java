@java.lang.Override
public void init() {
    if (!(initialized)) {
        buffer = new org.ogn.commons.collections.TimeWindowBuffer(org.ogn.gateway.plugin.live.LiveGlidernetForwarder.MAX_BUFFER_SIZE, org.ogn.gateway.plugin.live.LiveGlidernetForwarder.BUFFER_TIME_WINDOW, this, org.ogn.gateway.plugin.live.LiveGlidernetForwarder.AMPERSAND);
        org.springframework.context.support.ClassPathXmlApplicationContext ctx = new org.springframework.context.support.ClassPathXmlApplicationContext("classpath:application-context.xml");
        ctx.refresh();
        java.lang.String passwd = ctx.getBean(java.lang.String.class, "passwd");
        ctx.close();
        if ((forwarder) == null)
            forwarder = new org.ogn.gateway.plugin.live.HttpMsgSender(passwd);
        
        initialized = true;
    }
}