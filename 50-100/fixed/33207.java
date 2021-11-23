@org.osgi.service.component.annotations.Activate
public void activate(final com.enonic.xp.server.udc.impl.UdcConfig config) {
    this.timer = new java.util.Timer("udc");
    if (!(config.enabled())) {
        return ;
    }
    final com.enonic.xp.server.udc.impl.PingSenderImpl sender = new com.enonic.xp.server.udc.impl.PingSenderImpl(this.generator, config.url());
    final com.enonic.xp.server.udc.impl.PingTask task = new com.enonic.xp.server.udc.impl.PingTask(sender);
    this.timer.schedule(task, this.delay, this.interval);
}