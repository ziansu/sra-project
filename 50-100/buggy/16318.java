public java.util.List<com.fdm.wealthnow.common.Stock> getStocksFromExchangeString(java.util.List<java.lang.String> stocks, com.fdm.wealthnow.common.InfoType type) {
    com.fdm.wealthnow.service.StockService.rawStockList = new java.util.ArrayList<>();
    for (java.lang.String stock_symbol : stocks) {
        com.fdm.wealthnow.service.StockService.requestStock.add(new com.fdm.wealthnow.common.Stock(stock_symbol));
    }
    java.lang.String url = generateRequestURL(com.fdm.wealthnow.service.StockService.requestStock, type);
    getFromExhange(url);
    return createListStockObj(com.fdm.wealthnow.service.StockService.rawStockList, type);
}