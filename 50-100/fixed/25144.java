protected void prepareSocketForSni(javax.net.ssl.SSLSocket socket) {
    if (!(sniHostNames.isEmpty())) {
        java.util.List<javax.net.ssl.SNIServerName> sniNames = new java.util.ArrayList<>(sniHostNames.size());
        for (java.lang.String sniHostName : sniHostNames) {
            sniNames.add(new javax.net.ssl.SNIHostName(sniHostName));
        }
        javax.net.ssl.SSLParameters sslParameters = socket.getSSLParameters();
        sslParameters.setServerNames(sniNames);
        socket.setSSLParameters(sslParameters);
    }
}