public void login(android.view.View view) {
    switch (view.getId()) {
        case R.id.google :
            provider = com.microsoft.windowsazure.mobileservices.authentication.MobileServiceAuthenticationProvider.Google;
            break;
        default :
            break;
    }
    authenticate(false);
}