private boolean isAnalyzed(java.lang.String path, org.elasticsearch.mapping.Indexable indexable) {
    boolean isAnalysed = true;
    if (!(path.isEmpty())) {
        org.elasticsearch.annotation.StringField stringFieldAnnotation = indexable.getAnnotation(org.elasticsearch.annotation.StringField.class);
        if (stringFieldAnnotation != null) {
            if (!(IndexType.analyzed.equals(stringFieldAnnotation.indexType()))) {
                isAnalysed = false;
            }
        }
    }
    return isAnalysed;
}