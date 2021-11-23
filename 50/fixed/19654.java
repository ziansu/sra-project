@java.lang.Override
protected boolean onCompleteGameAction() {
    onUpdateGameAction(1.0);
    mover.onComplete();
    boolean isExited = switcher.onComplete();
    return isExited;
}