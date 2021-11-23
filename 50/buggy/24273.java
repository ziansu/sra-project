@java.lang.Override
public void start(android.app.Activity activity, com.auth0.identity.IdentityProviderRequest request, com.auth0.core.Application application) {
    checkPermissions(activity, request.getServiceName());
}