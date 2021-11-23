public void setState(com.azurechen.fcalendar.widget.FlexibleCalendar.State state) {
    if ((mState) != state) {
        mState = state;
        if ((mState) == (com.azurechen.fcalendar.widget.FlexibleCalendar.State.EXPANDED)) {
            mLayoutBtnGroupMonth.setVisibility(com.azurechen.fcalendar.widget.VISIBLE);
            mLayoutBtnGroupWeek.setVisibility(com.azurechen.fcalendar.widget.GONE);
        }
        if ((mState) == (com.azurechen.fcalendar.widget.FlexibleCalendar.State.COLLAPSED)) {
            mLayoutBtnGroupMonth.setVisibility(com.azurechen.fcalendar.widget.GONE);
            mLayoutBtnGroupWeek.setVisibility(com.azurechen.fcalendar.widget.VISIBLE);
        }
        mIsWaitingForUpdate = true;
        requestLayout();
    }
}