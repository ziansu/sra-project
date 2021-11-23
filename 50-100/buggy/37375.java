private void buildQuery(org.glassfish.jersey.client.JerseyWebTarget target, com.easemob.server.example.comm.wrapper.QueryWrapper query) {
    if ((null != query) && (!(query.getQueries().isEmpty()))) {
        for (org.apache.http.NameValuePair nameValuePair : query.getQueries()) {
            target.queryParam(nameValuePair.getName(), nameValuePair.getValue());
        }
    }
}