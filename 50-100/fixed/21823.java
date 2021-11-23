private static boolean existQuote(java.lang.String symbol) {
    boolean exists = false;
    try {
        yahoofinance.Stock stock = yahoofinance.YahooFinance.get(symbol);
        if ((com.udacity.stockhawk.util.GeneralUtils.isValid(stock)) && (com.udacity.stockhawk.util.GeneralUtils.hasHistory(stock, com.udacity.stockhawk.sync.QuoteSyncJob.YEARS_OF_HISTORY))) {
            exists = true;
        }
    } catch (java.lang.Exception e) {
        return false;
    }
    return exists;
}