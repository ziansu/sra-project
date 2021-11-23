static java.util.List<com.myjeeva.digitalocean.pojo.Key> getAvailableKeys(java.lang.String authToken) throws com.myjeeva.digitalocean.exception.DigitalOceanException, com.myjeeva.digitalocean.exception.RequestUnsuccessfulException {
    com.myjeeva.digitalocean.impl.DigitalOceanClient client = new com.myjeeva.digitalocean.impl.DigitalOceanClient(authToken);
    java.util.List<com.myjeeva.digitalocean.pojo.Key> availableKeys = new java.util.ArrayList<com.myjeeva.digitalocean.pojo.Key>();
    com.myjeeva.digitalocean.pojo.Keys keys;
    int page = 1;
    do {
        keys = client.getAvailableKeys(page);
        availableKeys.addAll(keys.getKeys());
        page += 1;
    } while ((keys.getMeta().getTotal()) > page );
    return availableKeys;
}