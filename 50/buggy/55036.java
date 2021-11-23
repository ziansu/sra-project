public org.jclouds.openstack.nova.v2_0.options.CreateServerOptions writeFileToPath(byte[] contents, java.lang.String path) {
    com.google.common.base.Preconditions.checkState(((personality.size()) < 5), "maximum number of files allowed is 5");
    personality.add(new org.jclouds.openstack.nova.v2_0.options.CreateServerOptions.File(path, contents));
    return this;
}