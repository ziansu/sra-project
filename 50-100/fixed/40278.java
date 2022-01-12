@java.lang.Override
public com.blackbirdai.client.SearchResponse map(com.blackbirdai.client.HttpResponse httpResponse) {
    int code = httpResponse.getStatus().getCode();
    java.lang.String content = httpResponse.getContent().toString(com.google.common.base.Charsets.UTF_8);
    if ((code == 0) || (code == 200)) {
        return com.blackbirdai.client.SearchResponse.build(content, code);
    }else {
        java.lang.String message = "Request failed with HTTP status " + (httpResponse.getStatus());
        return new com.blackbirdai.client.SearchResponse(false, code, message, content);
    }
}