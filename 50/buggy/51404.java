protected synchronized org.openl.types.Invokable getInvoker() {
    if ((invoker) == null) {
        invoker = createInvoker();
    }
    return invoker;
}