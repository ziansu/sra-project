private void repositionNavigationBar() {
    if (((mNavigationBarView) == null) || (!(mNavigationBarView.isAttachedToWindow())))
        return ;
    
    prepareNavigationBarView(false);
    mWindowManager.updateViewLayout(mNavigationBarView, getNavigationBarLayoutParams());
}