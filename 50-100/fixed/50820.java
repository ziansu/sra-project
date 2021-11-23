public static java.util.Collection<java.lang.String> getConversionProviderNames() {
    java.util.Collection<java.lang.String> providers = javax.money.convert.MonetaryConversions.getMonetaryConversionsSpi().getProviderNames();
    if (java.util.Objects.isNull(providers)) {
        java.util.logging.Logger.getLogger(javax.money.convert.MonetaryConversions.class.getName()).warning(("No supported rate/conversion providers returned by SPI: " + (javax.money.convert.MonetaryConversions.getMonetaryConversionsSpi().getClass().getName())));
        return java.util.Collections.emptySet();
    }
    return providers;
}