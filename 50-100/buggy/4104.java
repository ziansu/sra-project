private org.kairosdb.client.ClientResponse execute(org.apache.http.client.methods.HttpUriRequest request) throws java.io.IOException {
    org.apache.http.HttpResponse response;
    int tries = ++(retries);
    while (true) {
        tries--;
        try {
            response = client.execute(request);
            break;
        } catch (java.io.IOException e) {
            if (tries < 1)
                throw e;
            
        }
    } 
    return new org.kairosdb.client.HttpClientResponse(response);
}