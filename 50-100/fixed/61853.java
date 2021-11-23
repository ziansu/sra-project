@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    java.lang.String result = ((com.home.young.myPassword.activity.GenPasswordDialog) (dialog)).getPassword();
    if ((result != null) && (!(result.equals("")))) {
        if (passwordView.isFocused()) {
            passwordView.setText(result);
        }else
            if (payPasswordView.isFocused()) {
                payPasswordView.setText(result);
            }
        
    }
}