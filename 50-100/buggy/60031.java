@org.junit.Test
@org.raml.emitter.Classed(one = org.raml.emitter.AnnotationInstanceEmitterTest.class)
public void classed() throws java.lang.Exception {
    java.lang.annotation.Annotation annotation = org.raml.emitter.AnnotationInstanceEmitterTest.class.getDeclaredMethod("classed").getAnnotation(org.raml.emitter.Classed.class);
    ramlAnnotationOfType(org.raml.emitter.Classed.class, annotation);
    org.raml.emitter.AnnotationInstanceEmitter emitter = new org.raml.emitter.AnnotationInstanceEmitter(writer, java.util.Collections.singletonList(ramlAnnotation));
    emitter.emitAnnotations(wrap(annotation));
    org.mockito.Mockito.verify(writer).appendLine("(Classed):");
    org.mockito.Mockito.verify(writer).appendLine("properties:");
    org.mockito.Mockito.verify(writer).appendLine("one: AnnotationInstanceEmitterTest");
}