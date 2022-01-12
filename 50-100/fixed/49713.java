private void addRequestTagsFromHeaders(java.util.Map<java.lang.String, ? extends java.util.Collection<java.lang.String>> headers) {
    for (java.lang.String name : this.traceKeys.getHttp().getHeaders()) {
        java.util.Collection<java.lang.String> values = headers.get(name);
        if (values != null) {
            addTagForEntry(name, values);
        }
    }
}