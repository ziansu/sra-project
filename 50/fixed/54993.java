@java.lang.Override
public void onClick(android.view.View v) {
    if ((mEventClickListener) != null) {
        mEventClickListener.onEventViewClick(v, this, mEvent);
    }
}