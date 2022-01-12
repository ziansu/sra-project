private void addRequestTagsFromHeaders(java.util.Map<java.lang.String, ? extends java.util.Collection<java.lang.String>> headers) {
    for (java.lang.String name : this.traceKeys.getHttp().getHeaders()) {
        for (java.util.Map.Entry<java.lang.String, ? extends java.util.Collection<java.lang.String>> entry : headers.entrySet()) {
            addTagForEntry(name, entry.getValue());
        }
    }
}