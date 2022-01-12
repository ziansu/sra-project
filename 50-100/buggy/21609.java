private void storeResponseInfoFrom(org.apache.http.HttpResponse response) throws java.io.IOException {
    this.response = response;
    org.apache.http.HttpEntity entity = response.getEntity();
    if (entity != null) {
        latestResponseContent = org.apache.commons.io.IOUtils.toByteArray(entity.getContent());
        latestResponseCode = response.getStatusLine().getStatusCode();
    }
}