@java.lang.SuppressWarnings(value = "unused")
@com.squareup.otto.Subscribe
public void onIdentityProviderAuthentication(com.auth0.lock.event.IdentityProviderAuthenticationRequestEvent event) {
    android.util.Log.v(com.auth0.lock.LockActivity.TAG, ("About to authenticate with service " + (event.getServiceName())));
    identity = lock.providerForName(event.getServiceName());
    identity.setCallback(callback);
    identity.start(this, event, lock.getConfiguration().getApplication());
    progressDialog = new android.app.ProgressDialog(this);
    progressDialog.setIndeterminate(true);
    progressDialog.setCancelable(false);
    progressDialog.show();
}