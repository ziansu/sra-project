public static java.util.List<java.lang.String> getDefaultConversionProviderChain() {
    java.util.List<java.lang.String> defaultChain = java.util.Optional.ofNullable(javax.money.convert.MonetaryConversions.getMonetaryConversionsSpi()).orElseThrow(() -> new javax.money.MonetaryException("No MonetaryConversionsSingletonSpi loaded, query functionality is not available.")).getDefaultProviderChain();
    java.util.Objects.requireNonNull(defaultChain, ("No default provider chain provided by SPI: " + (javax.money.convert.MonetaryConversions.getMonetaryConversionsSpi().getClass().getName())));
    return defaultChain;
}