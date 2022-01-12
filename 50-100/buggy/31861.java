@java.lang.Override
public void onLoginInteraction() {
    android.util.Log.d(com.concavenp.artistrymuse.MainActivity.TAG, "Starting Login activity");
    startActivityForResult(com.firebase.ui.auth.AuthUI.getInstance().createSignInIntentBuilder().setTheme(getSelectedTheme()).setLogo(getSelectedLogo()).setAvailableProviders(getSelectedProviders()).setTosUrl(getSelectedTosUrl()).setPrivacyPolicyUrl(getSelectedPrivacyPolicyUrl()).setIsSmartLockEnabled(false).setAllowNewEmailAccounts(true).build(), com.concavenp.artistrymuse.MainActivity.RC_SIGN_IN);
}