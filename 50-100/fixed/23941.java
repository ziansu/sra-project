private void manageState() {
    if (!(oldState.equals(myState.getState()))) {
        if (myState.getState().equals("main")) {
            myPlayer.stopMove();
        }
        if (myState.getState().equals("move")) {
            myPlayer.prepareMove();
        }
        oldState = myState.getState();
    }
    myActiveObjects = mySubMenus.get(myState.getState());
}