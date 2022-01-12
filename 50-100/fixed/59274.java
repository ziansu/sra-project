protected java.util.List<javax.lang.model.element.AnnotationMirror> findMirrors(javax.lang.model.element.Element type, java.lang.Class<? extends java.lang.annotation.Annotation> ann) {
    java.util.ArrayList<javax.lang.model.element.AnnotationMirror> ret = new java.util.ArrayList<javax.lang.model.element.AnnotationMirror>();
    java.util.List<? extends javax.lang.model.element.AnnotationMirror> mirrors = type.getAnnotationMirrors();
    for (javax.lang.model.element.AnnotationMirror m : mirrors) {
        javax.lang.model.element.Element element = m.getAnnotationType().asElement();
        if (element.getSimpleName().equals(ann.getSimpleName())) {
            ret.add(m);
        }
    }
    return ret;
}