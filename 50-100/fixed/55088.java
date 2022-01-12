public fx.service.HttpBuilder parameter(java.lang.String name, java.lang.String value) {
    java.lang.StringBuilder urlSB = new java.lang.StringBuilder();
    if ((url) == null) {
        urlSB.append(uri);
        urlSB.append('?');
    }else {
        urlSB.append(url);
        urlSB.append('&');
    }
    urlSB.append(name).append('=').append(value);
    url = urlSB.toString();
    return this;
}