private java.lang.String getSubProtocolsStr(java.lang.String[] subProtocols) {
    java.lang.String subProtocolsStr = null;
    if (subProtocols != null) {
        subProtocolsStr = "";
        for (java.lang.String subProtocol : subProtocols) {
            subProtocolsStr = subProtocolsStr.concat((subProtocol + ","));
        }
        subProtocolsStr = subProtocolsStr.substring(0, ((subProtocolsStr.length()) - 1));
    }
    return subProtocolsStr;
}