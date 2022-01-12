public void put(javax.ws.rs.client.WebTarget resource, milestone1.NodeInfo n) {
    javax.ws.rs.client.Invocation.Builder ib = resource.request(MediaType.APPLICATION_JSON);
    javax.ws.rs.core.Response res = ib.put(javax.ws.rs.client.Entity.entity(n, MediaType.APPLICATION_JSON));
}