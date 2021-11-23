public java.lang.String sendURLWithToken(java.lang.String urlType) {
    return networkCom(urlType, (("{\"user-token\": " + (token)) + "}\n"));
}