@java.lang.Override
public com.tqmall.search.canal.RowChangedData.Insert apply(com.alibaba.otter.canal.protocol.CanalEntry.RowData rowData) {
    com.tqmall.search.canal.RowChangedData.Insert insert = new com.tqmall.search.canal.RowChangedData.Insert(null);
    for (com.alibaba.otter.canal.protocol.CanalEntry.Column c : rowData.getAfterColumnsList()) {
        insert.fieldValueMap.put(c.getName(), c.getValue());
    }
    return insert;
}