private void clearFilterDates() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.clearFilterDates" + (getWorker())));
    filterStartDate.setValue(null);
    filterFinishDate.setValue(null);
}