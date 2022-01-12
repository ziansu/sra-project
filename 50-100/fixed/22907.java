public com.constellio.app.ui.entities.RecordVO getLinkedRecordVO(com.constellio.app.ui.entities.RecordVO eventVO) {
    com.constellio.app.ui.entities.RecordVO result;
    try {
        java.lang.String recordId = eventVO.get(Event.RECORD_ID);
        com.constellio.model.entities.records.Record linkedRecord = recordServices().getDocumentById(recordId);
        com.constellio.app.ui.framework.builders.RecordToVOBuilder voBuilder = new com.constellio.app.ui.framework.builders.RecordToVOBuilder();
        result = voBuilder.build(linkedRecord, VIEW_MODE.TABLE, view.getSessionContext());
    } catch (java.lang.Throwable t) {
        result = null;
    }
    return result;
}