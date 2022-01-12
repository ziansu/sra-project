@java.lang.Override
public void onAttachedToWindow() {
    super.onAttachedToWindow();
    (mAttachedPagesCounter)++;
    if ((mAttachedPagesCounter) < 2) {
        onAttachedFirst(getRootView().getContext());
    }
    if (!(mProxy.isLayouted()))
        setLoadingState();
    else
        resetLoadingState();
    
    updateIndicators();
}