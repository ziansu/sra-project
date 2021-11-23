@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if (!(v.isInTouchMode()))
        return false;
    
    if ((mNextPage) != (INVALID_PAGE))
        return false;
    
    if ((!(mLauncher.isAllAppsVisible())) || (mLauncher.getWorkspace().isSwitchingState()))
        return false;
    
    return (!(mLauncher.isDraggingEnabled())) && (beginDragging(v));
}