private static com.intelliment.entity.Protocol.ProtocolType extractProtocol(java.lang.String format) {
    java.lang.String onlyProtocol = "(TCP|UDP|tcp|udp)";
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(onlyProtocol);
    java.util.regex.Matcher matcher = pattern.matcher(format);
    matcher.find();
    java.lang.String matchedValue = matcher.group().toUpperCase();
    com.intelliment.entity.Protocol.ProtocolType protocolType = com.intelliment.entity.Protocol.ProtocolType.valueOf(matchedValue);
    return protocolType;
}