public void propagateAsErrorIfCancelException(final java.lang.Throwable t) {
    try {
        if (t instanceof org.eclipse.xtext.service.OperationCanceledError) {
            throw t;
        }
        final java.lang.RuntimeException opCanceledException = this.getPlatformOperationCanceledException(t);
        boolean _notEquals = !(com.google.common.base.Objects.equal(opCanceledException, null));
        if (_notEquals) {
            throw new org.eclipse.xtext.service.OperationCanceledError(opCanceledException);
        }
    } catch (java.lang.Throwable _e) {
        throw org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);
    }
}