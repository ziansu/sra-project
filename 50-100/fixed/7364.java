public void backupPortfolio(android.content.Context context, java.lang.String fileName) {
    persist();
    this.mAppStorage.putString(nitezh.ministock.domain.PortfolioStockRepository.PORTFOLIO_JSON, getStocksJson().toString()).apply();
    java.lang.String rawJson = this.mAppStorage.getString(nitezh.ministock.domain.PortfolioStockRepository.PORTFOLIO_JSON, "");
    if (nitezh.ministock.UserData.writeExternalStorage(context, rawJson, (fileName + ".txt"), "portfoliobackups/"))
        nitezh.ministock.DialogTools.showSimpleDialog(context, "PortfolioActivity backed up", ("Your portfolio settings have been backed up to ministocks/portfoliobackups/" + fileName));
    
}