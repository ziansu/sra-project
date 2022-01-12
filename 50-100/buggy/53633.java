@java.lang.Override
public java.util.List<java.util.Map<java.lang.String, java.lang.String>> getOfferList(java.lang.String symbol, int actived) {
    com.citi.training.model.Orderdetail record = new com.citi.training.model.Orderdetail();
    record.setSymbol(symbol);
    record.setActive(actived);
    return orderdetailMapper.getBitList(record);
}