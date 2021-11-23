public org.apache.ambari.server.controller.MpackResponse registerMpack(org.apache.ambari.server.controller.MpackRequest mpackRequest) throws java.io.IOException, org.apache.ambari.server.controller.spi.ResourceAlreadyExistsException {
    if ((versionDefinitions) != null) {
        versionDefinitions.clear();
    }
    return mpackManager.registerMpack(mpackRequest);
}