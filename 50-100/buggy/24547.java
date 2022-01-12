@java.lang.Override
public void onClick(android.view.View view) {
    if ((!(isEmpty(createUsernameEditText))) && (!(isEmpty(createUsernameEditText)))) {
        createUserAccount(createUsernameEditText.getText().toString(), createPassEditText.getText().toString());
    }else {
        generateLoginAlert(R.string.emptyfield_error_title, R.string.emptyfield_error_message);
    }
}