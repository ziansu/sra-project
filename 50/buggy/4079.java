@java.lang.Override
public void onClick(android.view.View view) {
    mPhoneTwoEditTextString = mPhoneTwoEditText.getText().toString();
    if (validateEditText()) {
        sendingDataToServer();
        android.widget.Toast.makeText(getActivity(), "errors", Toast.LENGTH_SHORT).show();
    }
}