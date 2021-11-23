@java.lang.Override
public void onAuthenticated(com.firebase.client.AuthData authData) {
    application.setAuthData(authData);
    goToNextFragment();
}