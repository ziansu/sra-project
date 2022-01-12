@java.lang.Override
public void consumeInfo(group2.sdp.pc.breadbin.DynamicInfo dpi) {
    dynamicInfoChecker = new group2.sdp.pc.globalinfo.DynamicInfoChecker(globalInfo, dpi);
    boolean success = operationSuccessful(dpi);
    boolean problem = problemExists(dpi);
    if (((replan) || success) || problem) {
        currentOperation = planNextOperation(dpi);
        pathFinder.setOperation(currentOperation);
        replan = false;
    }
    pathFinder.consumeInfo(dpi);
}