public static java.util.Collection<java.lang.String> getConversionProviderNames() {
    java.util.Collection<java.lang.String> providers = java.util.Optional.ofNullable(javax.money.convert.MonetaryConversions.getMonetaryConversionsSpi()).orElseThrow(() -> new javax.money.MonetaryException("No MonetaryConversionsSingletonSpi loaded, query functionality is not available.")).getProviderNames();
    if (java.util.Objects.isNull(providers)) {
        java.util.logging.Logger.getLogger(javax.money.convert.MonetaryConversions.class.getName()).warning(("No supported rate/conversion providers returned by SPI: " + (javax.money.convert.MonetaryConversions.getMonetaryConversionsSpi().getClass().getName())));
        return java.util.Collections.emptySet();
    }
    return providers;
}