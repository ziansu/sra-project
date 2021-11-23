public void addPortfolioItem(ea.mw.model.PortfolioItem item) {
    if ((portfolio) == null) {
        portfolio = new java.util.ArrayList<ea.mw.model.PortfolioItem>();
    }
    portfolio.add(item);
}