@java.lang.Override
public void add(com.davidbracewell.hermes.Annotation annotation) {
    tree.add(annotation);
    long id = idAnnotationMap.size();
    annotation.setId(id);
    idAnnotationMap.put(id, annotation);
}