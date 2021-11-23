@java.lang.Override
public void execute() throws org.bonitasoft.engine.commons.exceptions.SBonitaException {
    platformService.deactiveTenant(tenantId);
    schedulerService.pauseJobs(tenantId);
    if (schedulerService.isStarted()) {
        schedulerService.delete(ActivateTenant.BPM_EVENT_HANDLING);
        schedulerService.delete(ActivateTenant.CLEAN_INVALID_SESSIONS);
    }
}