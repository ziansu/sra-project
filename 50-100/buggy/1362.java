public static boolean isIgnored(javax.lang.model.element.Element element) {
    if (element instanceof com.webcohesion.enunciate.javac.decorations.element.DecoratedElement) {
        java.util.List<com.webcohesion.enunciate.javac.javadoc.JavaDoc.JavaDocTagList> ignoreTags = com.webcohesion.enunciate.util.AnnotationUtils.getJavaDocTags("ignore", ((com.webcohesion.enunciate.javac.decorations.element.DecoratedElement<?>) (element)));
        if (!(ignoreTags.isEmpty())) {
            return true;
        }
    }
    return (element.getAnnotation(com.webcohesion.enunciate.metadata.Ignore.class)) != null;
}