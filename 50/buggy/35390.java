public org.apache.http.client.utils.URIBuilder addLimit(org.apache.http.client.utils.URIBuilder builder, java.lang.Integer limit) {
    builder.addParameter("limit", limit.toString());
    return builder;
}