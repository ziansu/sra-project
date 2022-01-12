com.fourspaces.couchdb.CouchResponse put(java.lang.String url, java.lang.String ctype, java.lang.String content) {
    org.apache.http.client.methods.HttpPut put = new org.apache.http.client.methods.HttpPut(buildUrl(url));
    if (content != null) {
        org.apache.http.HttpEntity entity;
        entity = new org.apache.http.entity.StringEntity(content, com.fourspaces.couchdb.Session.DEFAULT_CHARSET);
        put.setEntity(entity);
        put.setHeader(new org.apache.http.message.BasicHeader("Content-Type", ctype));
    }
    return http(put);
}