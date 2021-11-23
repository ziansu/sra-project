public static java.util.ArrayList<stock.theme.StockTheme> findCompanyWithTheme(java.lang.String theme) {
    java.util.ArrayList<stock.theme.StockTheme> companyList = new java.util.ArrayList<stock.theme.StockTheme>();
    for (int i = 0; i < (stock.market.StockMarketManager.stockCompanyList.size()); i++) {
        if (theme.equals(stock.market.StockMarketManager.stockCompanyList.get(i).getTheme())) {
            companyList.add(stock.market.StockMarketManager.stockCompanyList.get(i));
        }
    }
    return companyList;
}