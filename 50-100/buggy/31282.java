@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if (((event.getEventTime()) - (mPrevTouchTime)) > 250) {
        mPrevTouchTime = event.getEventTime();
        (mPageToDisplay)--;
        if ((mPageToDisplay) < 0)
            mPageToDisplay = 0;
        
        SavePreferences();
        mManualView.SetPage(mPageToDisplay);
    }
    return true;
}