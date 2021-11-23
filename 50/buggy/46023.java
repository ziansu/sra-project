@java.lang.Override
public void doLivenessAnalysis(java.util.List<java.lang.String> globalTemp) {
    initGenKillInOut(globalTemp);
    transferToLinkedList();
    buildCFG();
    updateInOut();
    printCodeList();
}