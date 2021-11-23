@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String userInput = mMessageEditText.getText().toString();
    if ((userInput == null) || ((userInput.length()) <= 0)) {
        return ;
    }
    sendUserMessage(userInput);
    mMessageEditText.setText("");
}