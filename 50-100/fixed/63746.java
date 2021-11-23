private boolean hasRefName(java.lang.String refName) {
    boolean result = false;
    if ((org.collectionspace.services.common.api.Tools.isBlank(refName)) == false) {
        try {
            org.collectionspace.services.common.api.RefName.Authority authority = org.collectionspace.services.common.api.RefName.Authority.parse(refName);
            if (authority != null) {
                result = true;
            }else {
                org.collectionspace.services.common.api.RefName.AuthorityItem authItem = org.collectionspace.services.common.api.RefName.AuthorityItem.parse(refName, true);
                result = authItem != null;
            }
        } catch (java.lang.IllegalArgumentException e) {
        }
    }
    return result;
}