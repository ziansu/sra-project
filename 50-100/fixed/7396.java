private void processMethod(final java.lang.reflect.Method method) {
    method.setAccessible(true);
    if ((com.matthewtamlin.spyglass.library.util.AnnotationUtil.getValueHandlerAnnotation(method)) != null) {
        processMethodWithValueHandler(method);
    }else
        if ((com.matthewtamlin.spyglass.library.util.AnnotationUtil.getCallHandlerAnnotation(method)) != null) {
            processMethodWithCallHandler(method);
        }
    
}