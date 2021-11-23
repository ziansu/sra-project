@java.lang.Override
public void onError(com.facebook.FacebookException exception) {
    mStatusTextView.setText(R.string.facebook_login_fail);
}