public void setState(int state, boolean animated) {
    if (animated) {
        mParentLayout.setLayoutTransition(mLayoutTransition);
        setLayoutTransition(mLayoutTransition);
    }else {
        mParentLayout.setLayoutTransition(null);
        setLayoutTransition(null);
    }
    mCurrentState = state;
    setPositions();
    setDrawables();
    notifyListeners();
}