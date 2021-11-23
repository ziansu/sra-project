public static com.w9jds.marketbot.classes.models.MarketHistory map(org.devfleet.crest.model.CrestMarketHistory history) {
    return new com.w9jds.marketbot.classes.models.MarketHistory.Builder().setAveragePrice(history.getAveragePrice()).setHighPrice(history.getHighPrice()).setLowPrice(history.getLowPrice()).setRecordDate(history.getDate()).setVolume(history.getVolume()).build();
}