private <T> T request(final java.lang.String method, final java.lang.Class<T> clazz, final javax.ws.rs.client.WebTarget resource, final javax.ws.rs.client.Invocation.Builder request, final javax.ws.rs.client.Entity<?> entity) throws com.spotify.docker.client.exceptions.DockerException, java.lang.InterruptedException {
    try {
        return headers(request).async().method(method, entity, clazz).get();
    } catch (java.util.concurrent.ExecutionException | org.glassfish.hk2.api.MultiException e) {
        throw propagate(method, resource, e);
    }
}