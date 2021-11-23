public java.util.List<com.ricogao.playpro.model.Record> getRecords() {
    if ((records) == null) {
        return loadAssociatedRecords();
    }
    return records;
}