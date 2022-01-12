@java.lang.Override
public java.lang.Object getNewValue() {
    if (null != (dataSource)) {
        return dataSource;
    }
    try {
        long id = ((java.lang.Long) (super.getOldValue()));
        dataSource = org.sleuthkit.autopsy.casemodule.Case.getCurrentCase().getSleuthkitCase().getContentById(id);
        return dataSource;
    } catch (java.lang.IllegalStateException | org.sleuthkit.datamodel.TskCoreException ex) {
        org.sleuthkit.autopsy.casemodule.events.DataSourceAddedEvent.logger.log(java.util.logging.Level.SEVERE, "Error doing lazy load for remote event", ex);
        return null;
    }
}