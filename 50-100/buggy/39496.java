public double getExchangeRate(java.time.LocalDate date, java.lang.String currency) {
    try {
        java.util.List<com.github.bumblebee.command.currency.dataprovider.nbrb.Currency> exchangeRates = parser.getDailyRates(date);
        for (com.github.bumblebee.command.currency.dataprovider.nbrb.Currency rate : exchangeRates) {
            if (currency.toUpperCase().equals(rate.getShortName())) {
                return rate.getRate();
            }
        }
        return 0;
    } catch (java.io.IOException | org.xml.sax.SAXException e) {
        throw new com.github.bumblebee.command.currency.exception.ExchangeRateRetrieveException(e);
    }
}