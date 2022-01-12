protected org.openl.types.Invokable getInvoker() {
    if ((invoker) == null) {
        synchronized(this) {
            if ((invoker) == null) {
                invoker = createInvoker();
            }
        }
    }
    return invoker;
}