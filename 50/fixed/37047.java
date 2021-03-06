@java.lang.Override
public void recordPhysicallyDeleted(com.constellio.model.extensions.events.records.RecordPhysicalDeletionEvent event) {
    com.constellio.model.entities.records.Record record = event.getRecord();
    try {
        com.constellio.app.ui.application.ConstellioUI.getCurrentSessionContext().removeSelectedRecordId(record.getId(), record.getTypeCode());
    } catch (java.lang.Throwable t) {
    }
}