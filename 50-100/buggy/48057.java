com.fourspaces.couchdb.CouchResponse put(java.lang.String url, java.lang.String ctype, java.lang.String content) {
    org.apache.http.client.methods.HttpPut put = new org.apache.http.client.methods.HttpPut(buildUrl(url));
    if (content != null) {
        org.apache.http.HttpEntity entity;
        try {
            entity = new org.apache.http.entity.StringEntity(content, com.fourspaces.couchdb.Session.DEFAULT_CHARSET);
            put.setEntity(entity);
            put.setHeader(new org.apache.http.message.BasicHeader("Content-Type", ctype));
        } catch (java.io.UnsupportedEncodingException e) {
            log.error(org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(e));
        }
    }
    return http(put);
}