private void parseAutoCreatePipeStreamForMultiInsert(java.util.List<com.huawei.streaming.cql.builder.operatorsplitter.SplitContext> splitContexts, com.huawei.streaming.cql.semanticanalyzer.analyzecontext.AnalyzeContext pcontext) throws com.huawei.streaming.cql.exception.ApplicationBuildException {
    if (pcontext instanceof com.huawei.streaming.cql.semanticanalyzer.analyzecontext.MultiInsertStatementAnalyzeContext) {
        com.huawei.streaming.cql.semanticanalyzer.analyzecontext.MultiInsertStatementAnalyzeContext mpc = ((com.huawei.streaming.cql.semanticanalyzer.analyzecontext.MultiInsertStatementAnalyzeContext) (pcontext));
        for (com.huawei.streaming.cql.semanticanalyzer.analyzecontext.MultiInsertAnalyzeContext mInsert : mpc.getMultiSelectBodyAnalyzeContexts()) {
            if (!(mInsert.isPipeStreamNotCreated())) {
                return ;
            }
            com.huawei.streaming.cql.builder.operatorsplitter.SplitContext sc = createPipeStreamSplitContext(mInsert.getOutputSchema());
            splitContexts.add(sc);
        }
    }
}