public static java.util.List<java.lang.String> getDefaultConversionProviderChain() {
    java.util.List<java.lang.String> defaultChain = javax.money.convert.MonetaryConversions.getMonetaryConversionsSpi().getDefaultProviderChain();
    java.util.Objects.requireNonNull(defaultChain, ("No default provider chain provided by SPI: " + (javax.money.convert.MonetaryConversions.getMonetaryConversionsSpi().getClass().getName())));
    return defaultChain;
}