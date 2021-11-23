@java.lang.Override
public void onApplicationEvent(org.springframework.context.event.ContextRefreshedEvent contextRefreshedEvent) {
    java.lang.System.out.println(contextRefreshedEvent.getApplicationContext().getId());
    if (contextRefreshedEvent.getApplicationContext().getId().endsWith(org.opensrp.web.listener.ApplicationStartupListener.APPLICATION_ID)) {
        scheduler.startJob(formSchedule);
        scheduler.startJob(openmrsScheduleSyncerScheduler);
        scheduler.startJob(atomfeedSchedule);
        scheduler.startJob(encounterSchedule);
        java.lang.System.out.println("STARTED ALL SCHEDULES");
    }
}