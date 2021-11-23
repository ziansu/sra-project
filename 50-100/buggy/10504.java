private edu.utsa.fileflow.client.fileflow.VariableAutomaton getValue(edu.utsa.fileflow.client.fileflow.FileFlowAnalysisDomain domain, edu.utsa.fileflow.cfg.FlowPointContext context) {
    edu.utsa.fileflow.antlr.FileFlowParser.FunctionCallContext ctx = ((edu.utsa.fileflow.antlr.FileFlowParser.FunctionCallContext) (context.getContext()));
    edu.utsa.fileflow.antlr.FileFlowParser.ValueContext v = ctx.value(0);
    edu.utsa.fileflow.client.fileflow.VariableAutomaton va;
    if ((v.Variable()) != null) {
        va = domain.table.get(v.Variable().getText());
    }else {
        va = new edu.utsa.fileflow.client.fileflow.VariableAutomaton(v.String().getText());
    }
    return va;
}