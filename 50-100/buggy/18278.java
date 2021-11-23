private com.google.common.collect.Table<java.lang.String, java.lang.String, com.proofpoint.event.collector.EventTapWriter.FlowInfo> constructFlowsFromTable(com.google.common.collect.Table<java.lang.String, java.lang.String, com.proofpoint.event.collector.EventTapWriter.FlowInfo.Builder> flows) {
    com.google.common.collect.ImmutableTable.Builder<java.lang.String, java.lang.String, com.proofpoint.event.collector.EventTapWriter.FlowInfo> flowsBuilder = com.google.common.collect.ImmutableTable.builder();
    for (com.google.common.collect.Table.Cell<java.lang.String, java.lang.String, com.proofpoint.event.collector.EventTapWriter.FlowInfo.Builder> cell : flows.cellSet()) {
        flowsBuilder.put(cell.getRowKey(), cell.getColumnKey(), cell.getValue().build(clock));
    }
    return flowsBuilder.build();
}