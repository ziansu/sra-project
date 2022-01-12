@java.lang.Override
public com.blackbirdai.client.SearchResponse map(com.blackbirdai.client.HttpResponse httpResponse) {
    int code = httpResponse.getStatus().getCode();
    if ((code == 0) || (code == 200)) {
        return com.blackbirdai.client.SearchResponse.build(httpResponse.getContent().toString(com.google.common.base.Charsets.UTF_8), code);
    }else {
        return new com.blackbirdai.client.SearchResponse(false, code, ("Request failed with HTTP status " + (httpResponse.getStatus())));
    }
}