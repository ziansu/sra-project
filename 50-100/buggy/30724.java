@java.lang.Override
public void onClick(android.view.View v) {
    mManager.send(new com.xlythe.textmanager.text.Text.Builder().message(mEditText.getText().toString()).addRecipients(mThread.getLatestMessage().getMembersExceptMe(getApplicationContext())).build());
    mEditText.setText(null);
    setSendable(false);
}