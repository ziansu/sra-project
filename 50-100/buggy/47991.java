@org.junit.Test
@org.raml.emitter.Simple(one = "hello")
public void simple() throws java.lang.Exception {
    final java.lang.annotation.Annotation annotation = org.raml.emitter.AnnotationInstanceEmitterTest.class.getDeclaredMethod("simple").getAnnotation(org.raml.emitter.Simple.class);
    ramlAnnotationOfType(org.raml.emitter.Simple.class, annotation);
    org.raml.emitter.AnnotationInstanceEmitter emitter = new org.raml.emitter.AnnotationInstanceEmitter(writer, java.util.Collections.singletonList(ramlAnnotation));
    emitter.emitAnnotations(new org.raml.emitter.AnnotationInstanceEmitterTest.SimpleAnnotable(annotation));
    org.mockito.Mockito.verify(writer).appendLine("(Simple):");
    org.mockito.Mockito.verify(writer).appendLine("properties:");
    org.mockito.Mockito.verify(writer).appendLine("one: hello");
}