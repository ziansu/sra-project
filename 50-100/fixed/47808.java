private java.lang.String getSubProtocolsStr(java.lang.String[] subProtocols) {
    if ((subProtocols == null) || ((subProtocols.length) == 0)) {
        return null;
    }
    java.lang.String subProtocolsStr = "";
    for (java.lang.String subProtocol : subProtocols) {
        subProtocolsStr = subProtocolsStr.concat((subProtocol + ","));
    }
    subProtocolsStr = subProtocolsStr.substring(0, ((subProtocolsStr.length()) - 1));
    return subProtocolsStr;
}