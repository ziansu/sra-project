private java.lang.String setContent(java.lang.String content, java.util.Map<java.lang.String, java.lang.String> params) {
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : params.entrySet()) {
        content = content.replace((("{" + (entry.getKey())) + "}"), entry.getValue());
    }
    return content;
}