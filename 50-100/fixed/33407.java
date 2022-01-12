@java.lang.Override
public void completed(eu.europeana.uim.orchestration.ExecutionContext<?, java.lang.String> context) {
    if ((context.getDataSet()) instanceof java.util.Collection) {
        flushCollectionMDRS(context.getDataSet().getId());
        flushRequestMDRS(context.getDataSet().getId());
    }
}