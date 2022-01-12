private org.apache.http.HttpResponse executeRequest(org.apache.http.client.methods.HttpRequestBase request) throws com.arangodb.ArangoException, java.net.SocketException {
    try {
        return client.execute(request);
    } catch (java.net.SocketException ex) {
        throw ex;
    } catch (org.apache.http.client.ClientProtocolException e) {
        throw new com.arangodb.ArangoException(e);
    } catch (java.io.IOException e) {
        throw new com.arangodb.ArangoException(e);
    }
}