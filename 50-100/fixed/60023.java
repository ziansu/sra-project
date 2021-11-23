@java.lang.Override
public void put(lv.iljakorneckis.simplestocks.model.Transaction item) {
    final java.lang.String symbol = item.getStockSymbol();
    final java.util.List<lv.iljakorneckis.simplestocks.model.Transaction> transactions = storage.get(symbol);
    if (transactions == null) {
        storage.put(symbol, java.util.Arrays.asList(item));
    }else {
        java.util.List<lv.iljakorneckis.simplestocks.model.Transaction> mergeList = new java.util.ArrayList<>();
        mergeList.addAll(transactions);
        mergeList.add(item);
        storage.put(symbol, mergeList);
    }
}