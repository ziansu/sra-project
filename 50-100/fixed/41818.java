@java.lang.Override
public edu.utsa.fileflow.client.fileflow.FileFlowAnalysisDomain onBefore(edu.utsa.fileflow.client.fileflow.FileFlowAnalysisDomain domain, edu.utsa.fileflow.cfg.FlowPointContext context) throws edu.utsa.fileflow.analysis.AnalysisException {
    gDomain = ((edu.utsa.fileflow.client.fileflow.grammar.GrammarAnalysisDomain) (context.getFlowPoint().getDomain(edu.utsa.fileflow.client.fileflow.grammar.GrammarAnalysisDomain.class)));
    vDomain = ((edu.utsa.fileflow.client.fileflow.variable.VariableAnalysisDomain) (context.getFlowPoint().getDomain(edu.utsa.fileflow.client.fileflow.variable.VariableAnalysisDomain.class)));
    return super.onBefore(domain, context);
}