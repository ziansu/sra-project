public static void saveState() {
    try {
        java.lang.String key = org.openmrs.scheduler.SchedulerService.class.getName();
        if (!(org.openmrs.api.context.Context.isRefreshingContext())) {
            org.openmrs.util.OpenmrsClassLoader.mementos.put(key, org.openmrs.api.context.Context.getSchedulerService().saveToMemento());
        }
    } catch (java.lang.Exception e) {
    }
}