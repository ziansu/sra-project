private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
    propertiesPanel.saveChanges();
    try {
        if ((org.sleuthkit.autopsy.centralrepository.datamodel.EamDb.getInstance()) != null) {
            centralRepoPanel.saveChanges();
        }
    } catch (org.sleuthkit.autopsy.centralrepository.datamodel.EamDbException ex) {
        org.openide.util.Exceptions.printStackTrace(ex);
    }
}