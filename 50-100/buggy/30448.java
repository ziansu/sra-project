@java.lang.Override
public void onDataEntered(java.lang.String data) {
    super.onDataEntered(data);
    if (currentWizard.actionPoints.isAtMinimum()) {
        endTurn();
        return ;
    }
    try {
        runCmd(data);
        currentWizard.onAction();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}