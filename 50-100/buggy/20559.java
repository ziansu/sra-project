protected boolean isStatementReady(terraingen.backend.graghlike.Statement statement) {
    boolean statementReady = true;
    java.util.List<terraingen.backend.graghlike.IInput<?>> inputList = statement.getInputs();
    for (terraingen.backend.graghlike.IInput<?> input : inputList)
        if (((input.getOutEdge()) != null) && (input.getOutEdge().isValueSet())) {
            statementReady = false;
            break;
        }
    
    return statementReady;
}