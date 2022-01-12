void addPathToField(java.lang.String fieldName, com.univocity.api.entity.html.HtmlPath path) {
    java.util.List<com.univocity.api.entity.html.HtmlPath> paths = ((java.util.List<com.univocity.api.entity.html.HtmlPath>) (fields.get(fieldName)));
    if (paths == null) {
        paths = new java.util.ArrayList<com.univocity.api.entity.html.HtmlPath>();
        fields.put(fieldName, paths);
    }
    paths.add(path);
}