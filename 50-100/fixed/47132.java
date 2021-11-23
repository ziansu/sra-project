private void visitInvoke(org.apache.bcel.generic.InvokeInstruction obj) {
    assert obj != null;
    com.h3xstream.findsecbugs.taintanalysis.TaintMethodSummary methodSummary = getMethodSummary(obj);
    com.h3xstream.findsecbugs.taintanalysis.Taint taint = getMethodTaint(methodSummary);
    assert taint != null;
    if (taint.isUnknown()) {
        taint.addTaintLocation(getTaintLocation(), false);
    }
    taintMutableArguments(methodSummary, obj);
    transferTaintToMutables(methodSummary, taint);
    modelInstruction(obj, getNumWordsConsumed(obj), getNumWordsProduced(obj), taint);
}