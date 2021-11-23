@java.lang.Override
public void run() {
    while (true) {
        try {
            for (org.springframework.conf.listener.ConfigurableApplicationContext cac : this.configurableApplicationContextList) {
                cac.refresh();
            }
            break;
        } catch (java.lang.Exception e) {
            org.springframework.conf.listener.PropertyWatchdog.log.error("spring application context refresh error", e);
            this.sleep(5000);
        }
    } 
    org.springframework.conf.listener.PropertyWatchdog.log.info("refresh spring application context finish[SUCCESS]");
}