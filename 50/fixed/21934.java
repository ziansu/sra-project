static com.typesafe.config.impl.Token newDouble(com.typesafe.config.ConfigOrigin origin, double value, java.lang.String originalText) {
    return com.typesafe.config.impl.Tokens.newValue(com.typesafe.config.impl.ConfigNumber.newNumber(origin, value, originalText), originalText);
}