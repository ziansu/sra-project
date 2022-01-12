@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if (((event.getEventTime()) - (mPrevTouchTime)) > 250) {
        mPrevTouchTime = event.getEventTime();
        if ((mPageToDisplay) > 1)
            --(mPageToDisplay);
        
        SavePreferences();
        mManualView.SetPage(mPageToDisplay);
    }
    return true;
}