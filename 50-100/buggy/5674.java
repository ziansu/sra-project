@java.lang.Override
public java.lang.Iterable<uk.gov.gchq.gaffer.operation.data.EntitySeed> doOperation(final uk.gov.gchq.gaffer.operation.impl.output.ToEntitySeeds operation, final uk.gov.gchq.gaffer.store.Context context, final uk.gov.gchq.gaffer.store.Store store) throws uk.gov.gchq.gaffer.operation.OperationException {
    if (null == (operation.getInput())) {
        return null;
    }
    return uk.gov.gchq.gaffer.commonutil.stream.Streams.toStream(operation.getInput()).map(EntitySeed::new).collect(uk.gov.gchq.gaffer.commonutil.stream.GafferCollectors.toCloseableIterable());
}