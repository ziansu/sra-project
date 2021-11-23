@java.lang.Override
public void onClick(android.view.View view) {
    mPhoneTwoEditTextString = mPhoneTwoEditText.getText().toString();
    if (validateEditText()) {
        sendingDataToServer();
    }
}