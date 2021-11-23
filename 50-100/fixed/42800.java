protected java.util.List<java.lang.String> installMac() {
    java.lang.String saveAs = resolver.getFilename();
    java.lang.String url = entity.getAttribute(RiakNode.DOWNLOAD_URL_MAC);
    return com.google.common.collect.ImmutableList.<java.lang.String>builder().add(brooklyn.entity.nosql.riak.INSTALL_TAR).add(brooklyn.entity.nosql.riak.INSTALL_CURL).add(commandToDownloadUrlAs(url, saveAs)).add(("tar xzvf " + saveAs)).build();
}