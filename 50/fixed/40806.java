static com.typesafe.config.impl.Token newInt(com.typesafe.config.ConfigOrigin origin, int value, java.lang.String originalText) {
    return com.typesafe.config.impl.Tokens.newValue(com.typesafe.config.impl.ConfigNumber.newNumber(origin, value, originalText), originalText);
}