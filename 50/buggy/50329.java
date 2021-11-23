public boolean isCalendarNotNull() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.isCalendarNotNull" + (getWorker())));
    return !(isCalendarNull());
}