@java.lang.Override
public android.content.pm.UserInfo getProfileParent(int userHandle) {
    com.android.server.pm.UserManagerService.checkManageUsersPermission("get the profile parent");
    synchronized(mPackagesLock) {
        android.content.pm.UserInfo profile = getUserInfoLocked(userHandle);
        if (profile == null) {
            return null;
        }
        int parentUserId = profile.profileGroupId;
        if (parentUserId == (android.content.pm.UserInfo.NO_PROFILE_GROUP_ID)) {
            return null;
        }else {
            return getUserInfoLocked(parentUserId);
        }
    }
}