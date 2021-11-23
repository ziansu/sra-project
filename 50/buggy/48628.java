public boolean isCalendarNull() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.isCalendarNull" + (getWorker())));
    if ((workerModel.getCalendar()) != null) {
        return false;
    }
    return true;
}