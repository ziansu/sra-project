@java.lang.Override
public boolean doPreAddUser(java.lang.String userName, java.lang.Object credential, java.lang.String[] roleList, java.util.Map<java.lang.String, java.lang.String> claims, java.lang.String profile, org.wso2.carbon.user.core.UserStoreManager userStoreManager) throws org.wso2.carbon.user.core.UserStoreException {
    try {
        if ((!(isEnable())) || (!(userStoreManager.isSCIMEnabled()))) {
            return true;
        }
    } catch (org.wso2.carbon.identity.scim.common.listener.org.wso2.carbon.user e) {
        throw new org.wso2.carbon.user.core.UserStoreException("Error while reading isScimEnabled from userstore manager", e);
    }
    this.getSCIMAttributes(userName, claims);
    return true;
}