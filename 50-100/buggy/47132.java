private void visitInvoke(org.apache.bcel.generic.InvokeInstruction obj) {
    com.h3xstream.findsecbugs.taintanalysis.TaintMethodSummary methodSummary = getMethodSummary(obj);
    com.h3xstream.findsecbugs.taintanalysis.Taint taint = getMethodTaint(methodSummary);
    if (taint.isUnknown()) {
        taint.addTaintLocation(getTaintLocation(), false);
    }
    taintMutableArguments(methodSummary, obj);
    transferTaintToMutables(methodSummary, taint);
    modelInstruction(obj, getNumWordsConsumed(obj), getNumWordsProduced(obj), taint);
}