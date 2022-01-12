public java.util.List<AnnotationEntity> readInAnnotationFile(java.lang.String textName, java.lang.String path) {
    java.lang.String fileName = textName + ".ann";
    java.util.List<java.lang.String> annotations = readFileToLines(fileName, path);
    java.util.List<AnnotationEntity> entities = new java.util.ArrayList<>();
    for (java.lang.String annotation : annotations) {
        AnnotationEntity entity = new AnnotationEntity(annotation);
        entities.add(entity);
    }
    return entities;
}