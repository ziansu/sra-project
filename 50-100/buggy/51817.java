com.fourspaces.couchdb.CouchResponse post(java.lang.String url, java.lang.String content, java.lang.String queryString) {
    org.apache.http.client.methods.HttpPost post = new org.apache.http.client.methods.HttpPost(buildUrl(url, queryString));
    if (content != null) {
        org.apache.http.HttpEntity entity;
        try {
            entity = new org.apache.http.entity.StringEntity(content, com.fourspaces.couchdb.Session.DEFAULT_CHARSET);
            post.setEntity(entity);
            post.setHeader(new org.apache.http.message.BasicHeader("Content-Type", com.fourspaces.couchdb.Session.MIME_TYPE_JSON));
        } catch (java.io.UnsupportedEncodingException e) {
            log.error(org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(e));
        }
    }
    return http(post);
}