public void doBackup() {
    if ("".equals(backupName.trim())) {
        backupName = null;
    }
    org.woym.logic.spec.IStatus status = org.woym.logic.BackupRestoreHandler.backup(backupName);
    javax.faces.application.FacesMessage msg = status.report();
    javax.faces.context.FacesContext.getCurrentInstance().addMessage(null, msg);
}