public static SourceSectionFilter.Builder createFunctionFilter(com.oracle.truffle.r.nodes.function.FunctionDefinitionNode fdn, java.lang.Class<?> tag) {
    com.oracle.truffle.api.instrumentation.SourceSectionFilter.Builder builder = com.oracle.truffle.api.instrumentation.SourceSectionFilter.newBuilder();
    builder.tagIs(tag);
    com.oracle.truffle.api.source.SourceSection fdns = fdn.getSourceSection();
    builder.indexIn(fdns.getCharIndex(), fdns.getCharLength());
    builder.sourceIs(fdns.getSource());
    return builder;
}