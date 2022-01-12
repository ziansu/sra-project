@java.lang.Override
public boolean process(java.util.Set<? extends javax.lang.model.element.TypeElement> annotations, javax.annotation.processing.RoundEnvironment roundEnv) {
    java.util.Set<javax.lang.model.element.TypeElement> tableTypes = javax.lang.model.util.ElementFilter.typesIn(roundEnv.getElementsAnnotatedWith(com.fsryan.forsuredb.annotations.FSTable.class));
    if ((tableTypes.size()) == 0) {
        return true;
    }
    com.fsryan.forsuredb.annotationprocessor.util.APLog.init(processingEnv);
    com.fsryan.forsuredb.annotationprocessor.util.AnnotationTranslatorFactory.init(processingEnv);
    com.fsryan.forsuredb.annotationprocessor.util.APLog.i(com.fsryan.forsuredb.annotationprocessor.FSAnnotationProcessor.LOG_TAG, "Running FSAnnotationProcessor");
    processFSTableAnnotations(tableTypes);
    return true;
}