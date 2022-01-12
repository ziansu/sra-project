@java.lang.Override
public boolean checkPermissions(@javax.annotation.Nonnull
net.proteusframework.internet.http.Request request, @javax.annotation.Nullable
net.proteusframework.users.model.Principal principal) {
    if (functionExists(_appUtil.getSite(), request, _applicationRegistry, _registeredLinkDAO)) {
        if (principal == null)
            return false;
        
        return com.example.app.support.service.AppUtil.userHasAdminRole(principal);
    }
    return false;
}