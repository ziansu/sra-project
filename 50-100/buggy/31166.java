private int showConfirmUserEditionDialog() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.showConfirmUserEditionDialog" + (getWorker())));
    try {
        return org.zkoss.zul.Messagebox.show(org.libreplan.web.I18nHelper._("Unsaved changes will be lost. Would you like to continue?"), org.libreplan.web.I18nHelper._("Confirm editing user"), ((org.zkoss.zul.Messagebox.OK) | (org.zkoss.zul.Messagebox.CANCEL)), Messagebox.QUESTION);
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.RuntimeException(e);
    }
}