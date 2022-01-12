@java.lang.Override
public void onClick(android.view.View v) {
    if ((loginFragmentOnClickListener) != null) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.example.adriftbookclient.oobhomeworkclient.LoginFragment.USER_NAME, userNameEt.getText().toString().trim());
        bundle.putString(com.example.adriftbookclient.oobhomeworkclient.LoginFragment.PASSWORD, passwordEt.getText().toString().trim());
        loginFragmentOnClickListener.onClick(v, bundle);
    }
}