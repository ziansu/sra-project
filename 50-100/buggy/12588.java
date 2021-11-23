@java.lang.Override
protected void onPostExecute(ca.rmen.android.scrumchatter.meeting.detail.MeetingPagerAdapter result) {
    mMeetingPagerAdapter = result;
    mBinding.activityLoading.setVisibility(View.GONE);
    mBinding.pager.setAdapter(mMeetingPagerAdapter);
    int position = mMeetingPagerAdapter.getPositionForMeetingId(mMeetingId);
    ca.rmen.android.scrumchatter.util.Log.v(TAG, ((("meeting " + (mMeetingId)) + " is on page ") + position));
    mBinding.pager.setCurrentItem(position);
}