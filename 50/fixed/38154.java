static com.typesafe.config.impl.Token newLong(com.typesafe.config.ConfigOrigin origin, long value, java.lang.String originalText) {
    return com.typesafe.config.impl.Tokens.newValue(com.typesafe.config.impl.ConfigNumber.newNumber(origin, value, originalText), originalText);
}