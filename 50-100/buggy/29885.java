@java.lang.Override
public void onStateChanged(int state) {
    android.util.Log.d(com.github.naz013.awcalendar.AwesomeCalendarView.TAG, ("onStateChanged: " + state));
    if (state == (PageSlideAnimator.STATE_SLIDE_LEFT)) {
        calculateCalendar((-1));
    }else
        if (state == (PageSlideAnimator.STATE_SLIDE_RIGHT)) {
            calculateCalendar(1);
        }else
            if (state == (CollapseExpandAnimator.STATE_COLLAPSED)) {
                mAnimator = mSlideAnimator;
                calculateCalendar(0);
            }else
                if (state == (CollapseExpandAnimator.STATE_EXPANDED)) {
                    calculateCalendar(0);
                }
            
        
    
    mState = state;
}