private boolean isValidServerResponse(no.api.regurgitator.storage.ServerResponse sr) {
    return ((((sr == null) || ((sr.getContent()) == null)) || ((sr.getMeta()) == null)) || ((sr.getMeta().getMethod()) == null)) || ((sr.getMeta().getUri()) == null);
}