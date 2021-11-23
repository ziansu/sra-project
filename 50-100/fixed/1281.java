@java.lang.Override
public java.util.List<java.lang.String> visit(IC.lir.CallStatement callStatement, java.util.List<java.lang.String> targetRegisters) throws java.lang.Exception {
    java.util.List<java.lang.String> callStatementBlock = new java.util.LinkedList<java.lang.String>();
    IC.lir.Call call = callStatement.getCall();
    java.util.List<java.lang.String> callStatementTR = call.accept(this, new java.util.LinkedList<java.lang.String>());
    callStatementBlock.addAll(callStatementTR);
    return callStatementBlock;
}