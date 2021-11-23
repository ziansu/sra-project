private java.util.Map<java.lang.String, com.uci.mode.BaseEntry> getEntryMap(com.uci.constant.Tag tag, java.lang.String text) {
    if (com.google.common.base.Strings.isNullOrEmpty(text)) {
        return new java.util.HashMap<>();
    }
    java.util.List<java.lang.String> tokens = getTokens(text);
    return buildPosMap(tag, tokens);
}