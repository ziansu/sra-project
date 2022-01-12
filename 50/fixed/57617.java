private java.util.List<com.stefandekanski.weakwrap.processor.MethodSpec> createWrappedMethods() {
    java.util.LinkedList<com.stefandekanski.weakwrap.processor.MethodSpec> wrappedMethods = new java.util.LinkedList<>();
    for (javax.lang.model.element.ExecutableElement method : getMethodList(typeElement)) {
        wrappedMethods.add(wrapMethod(method));
    }
    return wrappedMethods;
}