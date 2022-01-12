public org.openforis.collect.model.CollectRecord toCollectRecord(org.openforis.collect.android.collectadapter.UiRecord uiRecord, org.openforis.collect.model.CollectSurvey collectSurvey) {
    org.openforis.collect.model.CollectRecord collectRecord = new org.openforis.collect.model.CollectRecord(collectSurvey, lastVersion(collectSurvey));
    collectRecord.setStep(CollectRecord.Step.CLEANSING);
    collectRecord.setId(uiRecord.getId());
    org.openforis.idm.model.Entity rootEntity = collectRecord.createRootEntity(uiRecord.getName());
    rootEntity.setId(uiRecord.getId());
    addChildNodes(rootEntity, uiRecord, collectRecord);
    new org.openforis.collect.model.RecordUpdater().initializeRecord(collectRecord);
    return collectRecord;
}