private <T> T getObject(java.lang.String url, java.lang.Class<T> type) {
    this.services = client.target(((com.excilys.formation.computerdb.ui.RestCLI.BASE_URL) + url));
    javax.ws.rs.client.Invocation.Builder request = this.services.request(MediaType.APPLICATION_JSON);
    javax.ws.rs.core.Response response = request.get();
    if ((response.getStatus()) == 200) {
        return response.readEntity(type);
    }
    return null;
}