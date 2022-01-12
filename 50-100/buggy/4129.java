@java.lang.Override
public void onClick(com.sendbird.android.sample.groupchannel.View v) {
    java.lang.String userInput = mMessageEditText.getText().toString();
    if ((userInput == null) || ((userInput.length()) <= 0)) {
        return ;
    }
    sendUserMessage(userInput);
    mMessageEditText.setText("");
}