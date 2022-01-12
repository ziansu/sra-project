@java.lang.Override
public void onApplicationEvent(final org.springframework.context.event.ContextRefreshedEvent event) {
    org.springframework.context.ApplicationContext appCtx = event.getApplicationContext();
    intelligentBoxClient.ss.bootstrapper.Bootstrapper bootstrapper = appCtx.getBean(intelligentBoxClient.ss.bootstrapper.Bootstrapper.class);
    if (!(bootstrapper.startup())) {
        intelligentBoxClient.ss.listeners.RefreshListener.logger.fatal("Failed to start up.");
        org.springframework.boot.SpringApplication.exit(appCtx, new intelligentBoxClient.ss.listeners.RefreshListener.AbortExitCodeGenerator());
    }
    genData(appCtx);
    genLru(appCtx);
}