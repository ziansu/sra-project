@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
    if ((com.almalence.opencam.ApplicationScreen.mApplicationStarted) && (com.almalence.opencam.ApplicationScreen.mCameraStarted))
        return com.almalence.opencam.ApplicationScreen.getGUIManager().onTouch(view, event);
    
    return true;
}