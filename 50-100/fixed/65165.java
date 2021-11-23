@java.lang.Override
public org.cesecore.certificates.endentity.EndEntityInformation findUser(org.cesecore.authentication.tokens.AuthenticationToken authenticationToken, java.lang.String username) throws org.cesecore.authorization.AuthorizationDeniedException {
    for (final org.ejbca.core.model.era.RaMasterApi raMasterApi : raMasterApis) {
        if (raMasterApi.isBackendAvailable()) {
            try {
                final org.cesecore.certificates.endentity.EndEntityInformation result = raMasterApi.findUser(authenticationToken, username);
                if (result != null) {
                    return result;
                }
            } catch (java.lang.UnsupportedOperationException | org.ejbca.core.model.era.RaMasterBackendUnavailableException e) {
            }
        }
    }
    return null;
}