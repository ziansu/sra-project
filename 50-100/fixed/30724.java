protected void send() {
    mManager.send(new com.xlythe.textmanager.text.Text.Builder().message(mEditText.getText().toString()).addRecipients(mThread.getLatestMessage().getMembersExceptMe(getApplicationContext())).build());
    mEditText.setText(null);
}