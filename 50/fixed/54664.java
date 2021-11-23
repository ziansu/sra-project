@java.lang.Override
public com.xinran.pojo.OnOffStockRecord onStock(com.xinran.pojo.OnOffStockRecord record) throws com.xinran.exception.StockException {
    onOffStockRecordMapper.add(record);
    return record;
}