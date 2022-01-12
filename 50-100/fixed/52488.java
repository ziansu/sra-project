@java.lang.Override
public void onMeetingOpen(ca.rmen.android.scrumchatter.meeting.detail.Meeting meeting) {
    if ((mBinding.meetingFragmentPlaceholder) != null) {
        ca.rmen.android.scrumchatter.meeting.detail.MeetingFragment.startMeeting(getFragmentManager(), meeting.getId());
    }else {
        ca.rmen.android.scrumchatter.meeting.detail.MeetingActivity.startMeeting(getActivity(), meeting.getId());
    }
}