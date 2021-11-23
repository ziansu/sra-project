protected com.revolsys.record.schema.RecordDefinition getRecordDefinition() {
    if ((this.recordDefinition) == null) {
        hasNext();
    }
    return this.recordDefinition;
}