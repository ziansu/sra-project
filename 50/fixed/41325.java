public java.lang.String getTitle() {
    return isCompactTitleMode ? com.khrolenok.rates.util.StockNames.getInstance().getSymbol(goodCode) : goodCode;
}