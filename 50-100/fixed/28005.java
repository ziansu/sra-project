private com.health.Table deleteLastLines(final com.health.Table table, final com.health.input.InputDescriptor config) {
    int deletions = config.getIgnoreLast();
    int size = (table.size()) - 1;
    java.util.List<com.health.Record> tab = table.getRecords();
    while (deletions > 0) {
        table.removeRecord(tab.get(size));
        size--;
        deletions--;
    } 
    return table;
}