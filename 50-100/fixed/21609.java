private void storeResponseInfoFrom(org.apache.http.HttpResponse response) throws java.io.IOException {
    this.response = response;
    latestResponseCode = response.getStatusLine().getStatusCode();
    org.apache.http.HttpEntity entity = response.getEntity();
    if (entity != null) {
        latestResponseContent = org.apache.commons.io.IOUtils.toByteArray(entity.getContent());
    }else {
        latestResponseContent = new byte[0];
    }
}