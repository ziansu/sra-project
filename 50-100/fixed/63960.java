protected void blockUser() {
    passcode_reset.setVisibility(View.GONE);
    passcodeResetBtn.setVisibility(View.VISIBLE);
    passcodeView.setVisibility(View.GONE);
    profile_progress.setVisibility(View.GONE);
    passcode_description.setText(getString(R.string.msgblockuser));
    passcode_description.setVisibility(View.VISIBLE);
    passcode_error.setVisibility(View.GONE);
    accont_image.setImageResource(R.drawable.icn_secure);
    passcode_title.setText(getString(R.string.msgblocktitle));
}