public java.net.URI getStorageUrl(java.lang.String container, java.lang.String object) {
    return java.net.URI.create((((((this.getStorageUrl()) + "/") + (ch.iterate.openstack.swift.model.Region.encode(container))) + "/") + (ch.iterate.openstack.swift.model.Region.encode(object, true))));
}