@java.lang.Override
public T call() throws java.lang.Exception {
    return impersonator.doAs(namespaceMeta.getNamespaceId(), callable);
}