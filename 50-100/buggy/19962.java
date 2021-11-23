@java.lang.Override
public void onPause() {
    if ((!(editText.getText().toString().equals(Constants.TAP))) && ((editText.getText().toString().length()) != 0)) {
        questionAnswer.getResponse().clear();
        questionAnswer.getResponse().add(editText.getText().toString());
    }
    hideKeyboard();
    super.onPause();
}