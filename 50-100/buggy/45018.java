private <T> T request(final java.lang.String method, final javax.ws.rs.core.GenericType<T> type, final javax.ws.rs.client.WebTarget resource, final javax.ws.rs.client.Invocation.Builder request) throws com.spotify.docker.client.exceptions.DockerException, java.lang.InterruptedException {
    try {
        return headers(request).async().method(method, type).get();
    } catch (java.util.concurrent.ExecutionException | org.glassfish.hk2.api.MultiException e) {
        throw propagate(method, resource, e);
    }
}