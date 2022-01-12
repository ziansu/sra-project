public boolean isReachable(org.sosy_lab.cpachecker.cpa.arg.ARGPath pErrorPath, org.sosy_lab.cpachecker.cpa.smg.SMGState pInitialState) throws java.lang.InterruptedException, org.sosy_lab.cpachecker.exceptions.CPAException {
    if ((pErrorPath.size()) == 1) {
        return true;
    }
    return isReachable(pErrorPath, pInitialState, precision).isReachable();
}