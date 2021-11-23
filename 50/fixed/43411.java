public void setCurrentState(com.jamescho.game.state.State newState) {
    java.lang.System.gc();
    newState.init();
    mCurrentState = newState;
    mInputHandler.setCurrentState(mCurrentState);
}