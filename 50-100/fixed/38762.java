@android.support.annotation.Nullable
public net.openid.appauth.AuthState getCachedAuthState(@android.support.annotation.NonNull
nl.eduvpn.app.entity.Instance instance) {
    for (nl.eduvpn.app.entity.SavedAuthState savedAuthState : _savedAuthStateList) {
        if (savedAuthState.getInstance().getSanitizedBaseURI().equals(instance.getSanitizedBaseURI())) {
            return savedAuthState.getAuthState();
        }else
            if (((instance.getAuthorizationType()) == (nl.eduvpn.app.entity.AuthorizationType.DISTRIBUTED)) && ((savedAuthState.getInstance().getAuthorizationType()) == (nl.eduvpn.app.entity.AuthorizationType.DISTRIBUTED))) {
                return savedAuthState.getAuthState();
            }
        
    }
    return null;
}