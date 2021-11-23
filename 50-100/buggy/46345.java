@java.lang.Override
public org.checkerframework.dataflow.analysis.TransferResult<org.checkerframework.framework.flow.CFValue, org.checkerframework.framework.flow.CFStore> visitCase(org.checkerframework.dataflow.cfg.node.CaseNode n, org.checkerframework.dataflow.analysis.TransferInput<org.checkerframework.framework.flow.CFValue, org.checkerframework.framework.flow.CFStore> p) {
    org.checkerframework.dataflow.analysis.TransferResult<org.checkerframework.framework.flow.CFValue, org.checkerframework.framework.flow.CFStore> transferResult = super.visitCase(n, p);
    if ((n.getSwitchOperand()) instanceof org.checkerframework.dataflow.cfg.node.FieldAccessNode) {
        calculateBinaryComparison(n.getSwitchOperand(), n.getCaseOperand(), org.checkerframework.common.value.ValueTransfer.ComparisonOperators.EQUAL, p, transferResult.getThenStore(), transferResult.getElseStore());
    }
    return transferResult;
}