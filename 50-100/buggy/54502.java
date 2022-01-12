private stock.scraper.builder.YahooUrlBuilder createBuilder(stock.scraper.builder.StockCompany company, java.util.Date startDate, java.util.Date endDate, stock.scraper.builder.StockInterval interval) {
    stock.scraper.builder.YahooUrlBuilder builder = new stock.scraper.builder.impl.YahooUrlBuilderImpl();
    builder.setCompany(company);
    builder.setStartDate(startDate);
    builder.setEndDate(startDate);
    builder.setInterval(interval);
    return builder;
}