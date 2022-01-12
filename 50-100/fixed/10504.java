private edu.utsa.fileflow.client.fileflow.VariableAutomaton getValue(edu.utsa.fileflow.client.fileflow.FileFlowAnalysisDomain domain, edu.utsa.fileflow.cfg.FlowPointContext context) {
    edu.utsa.fileflow.antlr.FileFlowParser.FunctionCallContext ctx = ((edu.utsa.fileflow.antlr.FileFlowParser.FunctionCallContext) (context.getContext()));
    edu.utsa.fileflow.antlr.FileFlowParser.ValueContext v = ctx.value(0);
    if ((v.Variable()) != null)
        return domain.table.get(v.Variable().getText());
    
    return new edu.utsa.fileflow.client.fileflow.VariableAutomaton(v.String().getText());
}