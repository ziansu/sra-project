private void enterConference() {
    org.linphone.LinphoneManager.getLc().addAllToConference();
    displayConferenceHeader();
    mNoCurrentCall.setVisibility(View.GONE);
    mActiveCallHeader.setVisibility(View.GONE);
}