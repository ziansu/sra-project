public void show(boolean show) {
    if (show && (mFrame.isShown()))
        return ;
    
    com.mapswithme.util.UiUtils.showIf(show, mFrame);
}