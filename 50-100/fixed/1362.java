public static boolean isIgnored(javax.lang.model.element.Element element) {
    java.util.List<com.webcohesion.enunciate.javac.javadoc.JavaDoc.JavaDocTagList> ignoreTags = com.webcohesion.enunciate.util.AnnotationUtils.getJavaDocTags("ignore", element);
    return (!(ignoreTags.isEmpty())) || ((element.getAnnotation(com.webcohesion.enunciate.metadata.Ignore.class)) != null);
}