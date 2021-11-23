public uk.gov.gchq.gaffer.commonutil.iterable.CloseableIterable<? extends uk.gov.gchq.gaffer.data.element.Element> getEntitiesAndEdgesByEntityId2AndEdgeId2to3() {
    final uk.gov.gchq.gaffer.operation.impl.get.GetElements operation = new uk.gov.gchq.gaffer.operation.impl.get.GetElements.Builder().input(new uk.gov.gchq.gaffer.operation.data.EntitySeed(2), new uk.gov.gchq.gaffer.operation.data.EdgeSeed(2, 3, true)).build();
    return runExample(operation);
}