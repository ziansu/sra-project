public java.lang.String getEmail() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.getEmail" + (getWorker())));
    org.libreplan.business.users.entities.User user = getBoundUser();
    if (user != null) {
        return user.getEmail();
    }
    return "";
}