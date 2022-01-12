public void setProtocol(java.lang.String protocol) {
    if ((!("http".equals(protocol))) && (!("https".equals(protocol)))) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Protocol '%s' not supported. Use http or https!", protocol));
    }
    url.put(org.backmeup.storage.client.StorageConnectionStringBuilder.PROTOCOL, protocol);
}