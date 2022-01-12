@java.lang.Override
protected void initFields() {
    super.initFields();
    amountOpponents = opponents.size();
    allOponents = new com.quickblox.sample.groupchatwebrtc.fragments.ArrayList(opponents.size());
    allOponents.addAll(opponents);
    timerChronometer = ((android.widget.Chronometer) (getActivity().findViewById(R.id.timer_chronometer_action_bar)));
    java.lang.String callerName = dbManager.getUserNameById(currentSession.getCallerID());
    isPeerToPeerCall = (opponents.size()) == 1;
    isVideoCall = QBRTCTypes.QBConferenceType.QB_CONFERENCE_TYPE_VIDEO.equals(currentSession.getConferenceType());
}