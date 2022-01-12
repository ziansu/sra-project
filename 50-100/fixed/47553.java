@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    com.facebook.AccessToken at = loginResult.getAccessToken();
    com.facebook.Profile p = com.facebook.Profile.getCurrentProfile();
    android.content.Intent createIntent = new android.content.Intent(getActivity(), com.sasy.dareu.android.MainActivity.class);
    getActivity().startActivity(createIntent);
    getActivity().finish();
}