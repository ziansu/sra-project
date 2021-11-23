@java.lang.Override
public java.util.List<org.yccheok.jstock.engine.Stock> getStocks(java.util.List<org.yccheok.jstock.engine.Code> codes) throws org.yccheok.jstock.engine.StockNotFoundException {
    for (int i = 0; i < (org.yccheok.jstock.engine.GoogleStockServer.NUM_OF_RETRY); i++) {
        try {
            java.util.List<org.yccheok.jstock.engine.Stock> stocks = _getStocks(codes);
            return stocks;
        } catch (org.yccheok.jstock.engine.StockNotFoundException ex) {
            if (true) {
                if ((i + 1) >= (org.yccheok.jstock.engine.GoogleStockServer.NUM_OF_RETRY)) {
                    throw ex;
                }
            }else {
                throw ex;
            }
        }
    }
    assert false;
    return null;
}