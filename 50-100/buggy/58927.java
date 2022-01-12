private java.lang.String extractId(java.lang.String url) {
    java.lang.String[] urlParts = url.split("&");
    java.lang.String[] idPart = urlParts[0].split("=");
    if (idPart[1].contains(".")) {
        java.lang.String[] id = idPart[1].split("[.]");
        return id[1];
    }else {
        return idPart[1];
    }
}