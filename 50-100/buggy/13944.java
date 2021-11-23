@java.lang.Override
public java.lang.Iterable<? extends java.util.Map<java.lang.String, java.lang.Object>> doOperation(final uk.gov.gchq.gaffer.operation.impl.output.ToMap operation, final uk.gov.gchq.gaffer.store.Context context, final uk.gov.gchq.gaffer.store.Store store) throws uk.gov.gchq.gaffer.operation.OperationException {
    if (null == (operation.getInput())) {
        return null;
    }
    return new uk.gov.gchq.gaffer.commonutil.iterable.WrappedCloseableIterable(operation.getElementGenerator().apply(operation.getInput()));
}