@java.lang.Override
public void add(com.davidbracewell.hermes.Annotation annotation) {
    tree.add(annotation);
    idAnnotationMap.put(annotation.getId(), annotation);
}