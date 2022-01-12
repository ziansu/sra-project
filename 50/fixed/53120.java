@java.lang.Override
public void execute() throws org.bonitasoft.engine.commons.exceptions.SBonitaException {
    platformService.deactiveTenant(tenantId);
    if (schedulerService.isStarted()) {
        schedulerService.pauseJobs(tenantId);
        schedulerService.delete(ActivateTenant.BPM_EVENT_HANDLING);
        schedulerService.delete(ActivateTenant.CLEAN_INVALID_SESSIONS);
    }
}