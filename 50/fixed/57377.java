@java.lang.Override
public void start() throws java.io.IOException {
    super.start();
    org.globus.cog.abstraction.impl.execution.coaster.BootstrapService.logger.info(("Socket bound. URL is " + (getURL())));
}