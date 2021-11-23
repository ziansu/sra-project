private void buildAndSaveDataValue(java.lang.String uid, java.lang.String value) {
    org.eyeseetea.malariacare.data.database.iomodules.dhis.importer.models.DataValueExtended dataValue = new org.eyeseetea.malariacare.data.database.iomodules.dhis.importer.models.DataValueExtended();
    dataValue.setDataElement(uid);
    dataValue.setLocalEventId(currentEvent.getLocalId());
    dataValue.setEvent(currentEvent.getEvent());
    dataValue.setStoredBy(getSafeUsername());
    dataValue.setValue(value);
    dataValue.save();
}