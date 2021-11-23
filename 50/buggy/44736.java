public <R> org.openstack4j.core.transport.HttpResponse execute(org.openstack4j.core.transport.HttpRequest<R> request) {
    org.openstack4j.core.transport.internal.HttpExecutor.LOG.debug("Executing Request: %s -> %s", request.getEndpoint(), request.getPath());
    return service().execute(request);
}