@java.lang.Override
public java.lang.Double calculateProfit(java.lang.Integer portfolioid) {
    java.lang.Double profit = 0.0;
    java.util.List<com.citi.portfolio.entity.Position> positions = positionService.getAllPositionsOfPortfolio(portfolioid);
    for (com.citi.portfolio.entity.Position position : positions) {
        if ((position.getProfit()) != null) {
            profit += position.getProfit();
        }
    }
    return com.citi.portfolio.util.DoubleFormat.format(profit);
}