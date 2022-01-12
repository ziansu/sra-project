public org.jclouds.openstack.nova.v2_0.options.CreateServerOptions writeFileToPath(byte[] contents, java.lang.String path) {
    personality.add(new org.jclouds.openstack.nova.v2_0.options.CreateServerOptions.File(path, contents));
    return this;
}