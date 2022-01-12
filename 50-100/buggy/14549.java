@java.lang.Override
public com.tqmall.search.canal.RowChangedData.Delete apply(com.alibaba.otter.canal.protocol.CanalEntry.RowData rowData) {
    com.tqmall.search.canal.RowChangedData.Delete delete = new com.tqmall.search.canal.RowChangedData.Delete(null);
    for (com.alibaba.otter.canal.protocol.CanalEntry.Column c : rowData.getBeforeColumnsList()) {
        delete.fieldValueMap.put(c.getName(), c.getValue());
    }
    return delete;
}