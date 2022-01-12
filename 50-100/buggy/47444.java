public java.util.List<com.uber.hoodie.common.model.HoodieRecord> generateUpdates(java.lang.String commitTime, java.util.List<com.uber.hoodie.common.model.HoodieRecord> baseRecords) throws java.io.IOException {
    java.util.List<com.uber.hoodie.common.model.HoodieRecord> updates = new java.util.ArrayList<>();
    for (com.uber.hoodie.common.model.HoodieRecord baseRecord : baseRecords) {
        com.uber.hoodie.common.model.HoodieRecord record = new com.uber.hoodie.common.model.HoodieRecord(baseRecord.getKey(), com.uber.hoodie.common.HoodieTestDataGenerator.generateRandomValue(baseRecord.getKey(), commitTime));
        updates.add(record);
        com.uber.hoodie.common.HoodieTestDataGenerator.logger.info((" GENERATING UPDATE FOR :" + (baseRecord.getKey())));
    }
    return updates;
}