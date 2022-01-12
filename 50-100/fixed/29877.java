public void updateAllColumnsToKeySection() {
    java.util.Map<org.talend.core.model.metadata.builder.connection.MetadataColumn, java.lang.String> colName2IdxMap = getAllColumnsToKeyMap();
    this.blockingKeySection.setColumnNameInput(colName2IdxMap);
    this.blockingKeySection.redrawnSubTableContent();
    this.matchingKeySection.setColumnNameInput(colName2IdxMap);
    this.matchAndSurvivorKeySection.setColumnNameInput(colName2IdxMap);
    this.particularDefaultSurvivorshipSection.setColumnNameInput(colName2IdxMap);
    this.particularDefaultSurvivorshipSection.redrawnSubTableContent();
    if (selectAlgorithmSection.isVSRMode()) {
        this.matchingKeySection.redrawnSubTableContent();
    }else {
        matchAndSurvivorKeySection.redrawnSubTableContent();
    }
}