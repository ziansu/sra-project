@java.lang.Override
public java.util.List<T> deserialiseToList(java.lang.String values) {
    try {
        java.lang.Object outputs = marginCall.fetchCalls(values).getOutput();
        return java.util.Arrays.asList(((T[]) (outputs)));
    } catch (com.tracegroup.transformer.exposedservices.MomException | com.tracegroup.transformer.exposedservices.RuleException | com.tracegroup.transformer.exposedservices.UnrecognizedMessageException | com.tracegroup.transformer.exposedservices.StructureException e) {
        java.lang.String msg = java.lang.String.format("error occurred while mapping the data {} to a list of margin calls", values);
        log.error(msg, e);
        throw new java.lang.RuntimeException(msg, e);
    }
}