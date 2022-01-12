public <AT> java.util.List<ac.uk.susx.tag.annotation.Annotation<AT>> getSentenceAnnotations(java.lang.Class<? extends ac.uk.susx.tag.annotator.IAnnotator<AT, ?>> class1) throws ac.uk.susx.tag.utils.IllegalAnnotationStorageException {
    java.lang.System.out.println(class1.toString());
    try {
        return annotations.get(class1).getClass().cast(annotations.get(class1));
    } catch (java.lang.ClassCastException ex) {
        throw new ac.uk.susx.tag.utils.IllegalAnnotationStorageException(class1.getClass());
    }
}