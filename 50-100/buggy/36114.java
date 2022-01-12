private java.lang.String getVersion(fr.ccouturi.ClientResponse response) {
    if ((response != null) && ((response.getHeaders()) != null)) {
        if ((response.getHeaders().getFirst("X-Version")) != null) {
            response.getHeaders().getFirst("X-Version");
        }else {
            return response.getHeaders().getFirst("version");
        }
    }
    return null;
}