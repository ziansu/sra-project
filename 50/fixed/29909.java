public void trade() {
    if (printRunningMessage) {
        java.lang.System.out.println(("Calling trade in game logic with type  " + (actionType)));
    }
    gl.trade(tradeResources);
    tradeResources = new int[2][3];
    actionType = 0;
    updateAllStats();
}