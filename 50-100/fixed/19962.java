@java.lang.Override
public void onPause() {
    questionAnswer.getResponse().clear();
    if ((!(editText.getText().toString().equals(Constants.TAP))) && ((editText.getText().toString().length()) != 0)) {
        questionAnswer.getResponse().add(editText.getText().toString());
    }
    hideKeyboard();
    super.onPause();
}