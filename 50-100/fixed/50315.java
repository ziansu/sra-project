@java.lang.Override
public java.lang.Double calculateProfit(java.lang.Integer managerid) {
    java.lang.Double profit = 0.0;
    java.util.List<com.citi.portfolio.entity.Portfolio> portfolios = portfolioService.getAllPortfoliosOfManager(managerid);
    for (com.citi.portfolio.entity.Portfolio portfolio : portfolios) {
        if ((portfolio.getProfit()) != null) {
            profit += portfolio.getProfit();
        }
    }
    return com.citi.portfolio.util.DoubleFormat.format(profit);
}