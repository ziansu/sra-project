@java.lang.Override
public com.xinran.pojo.OnOffStockRecord onStock(com.xinran.pojo.OnOffStockRecord record) throws com.xinran.exception.StockException {
    java.lang.Long id = onOffStockRecordMapper.add(record);
    record.setId(id);
    return record;
}