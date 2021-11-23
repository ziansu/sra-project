@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    java.lang.String message = "Sign in Successful";
    android.widget.Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    updateSessionsRecycler();
    if (appState.hasCurrentGym()) {
        startSessionButton.setEnabled(true);
        changeAccountsItem.setTitle(R.string.change_accounts);
    }
}