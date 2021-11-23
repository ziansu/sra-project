@java.lang.Override
protected boolean onCompleteGameAction() {
    onUpdateGameAction(1.0);
    if (!(switcher.isStopped()))
        mover.onComplete();
    
    boolean isExited = switcher.onComplete();
    return isExited;
}