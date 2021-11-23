private void updateExchangeRate() {
    if (getSourceAccountCurrency().equals(getTargetAccountCurrency())) {
        setExchangeRate(java.math.BigDecimal.ONE);
    }else {
        name.abuchen.portfolio.money.ExchangeRateTimeSeries series = getExchangeRateProviderFactory().getTimeSeries(getSourceAccountCurrency(), getTargetAccountCurrency());
        if (series != null)
            setExchangeRate(series.lookupRate(date).orElse(new name.abuchen.portfolio.money.ExchangeRate(date, java.math.BigDecimal.ONE)).getValue());
        else
            setExchangeRate(java.math.BigDecimal.ONE);
        
    }
}