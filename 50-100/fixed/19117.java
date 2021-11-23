public java.util.List<AnnotationEntity> readInAnnotationFile(java.lang.String textName) {
    textName = "antother_text";
    java.lang.String fileName = textName + ".ann";
    java.util.List<java.lang.String> annotations = readFileToLines(fileName);
    java.util.List<AnnotationEntity> entities = new java.util.ArrayList<>();
    for (java.lang.String annotation : annotations) {
        AnnotationEntity entity = new AnnotationEntity(annotation);
        entities.add(entity);
    }
    return entities;
}