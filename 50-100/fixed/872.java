@java.lang.Override
public java.lang.String copy(org.openstack4j.model.storage.object.options.ObjectLocation source, org.openstack4j.model.storage.object.options.ObjectLocation dest) {
    com.google.common.base.Preconditions.checkNotNull(source);
    com.google.common.base.Preconditions.checkNotNull(dest);
    org.openstack4j.core.transport.HttpResponse resp = put(java.lang.Void.class, dest.getURI()).header(org.openstack4j.model.storage.object.SwiftHeaders.X_COPY_FROM, source.getURI()).executeWithResponse();
    return resp.header(org.openstack4j.model.storage.object.SwiftHeaders.ETAG);
}