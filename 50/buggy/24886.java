public void addOpponentsFragment() {
    stoptIncomingCallTimer();
    getFragmentManager().beginTransaction().replace(R.id.fragment_container, new com.quickblox.sample.videochatwebrtcnew.fragments.OpponentsFragment(), com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.OPPONENTS_CALL_FRAGMENT).commit();
}