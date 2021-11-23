@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if ((v != (editName)) && (editName.getText().toString().isEmpty())) {
        mUsernameLayout.setErrorEnabled(true);
    }else {
        mUsernameLayout.setErrorEnabled(false);
    }
}