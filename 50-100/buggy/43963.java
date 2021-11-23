@java.lang.Override
protected ca.rmen.android.scrumchatter.meeting.detail.MeetingPagerAdapter doInBackground(java.lang.Void... param) {
    if (meetingId < 0) {
        ca.rmen.android.scrumchatter.meeting.detail.Meeting newMeeting = ca.rmen.android.scrumchatter.meeting.detail.Meeting.createNewMeeting(this);
        mMeetingId = newMeeting.getId();
    }else {
        mMeetingId = meetingId;
    }
    int teamId = android.preference.PreferenceManager.getDefaultSharedPreferences(this).getInt(Constants.PREF_TEAM_ID, Constants.DEFAULT_TEAM_ID);
    return new ca.rmen.android.scrumchatter.meeting.detail.MeetingPagerAdapter(this, teamId, getSupportFragmentManager());
}