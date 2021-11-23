@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    mMeetings = new ca.rmen.android.scrumchatter.meeting.Meetings(((android.support.v4.app.FragmentActivity) (activity)));
}