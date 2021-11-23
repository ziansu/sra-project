@javax.ejb.Schedule(second = "*/1", minute = "*", hour = "*", persistent = false)
private void checkModules() {
    (counter)++;
    for (at.arz.latte.framework.persistence.models.Module module : bean.getAllEnabledModules()) {
        int checkInterval = module.getInterval();
        if ((checkInterval > 0) && (((counter) % checkInterval) == 0)) {
            checkStatus(module);
        }
    }
}