public static void set(com.google.firebase.auth.FirebaseUser user) {
    if (((wumf.com.sharedapps.CurrentUser.currentUser) == null) && (user != null)) {
        java.lang.String uid = user.getUid();
        wumf.com.sharedapps.firebase.TagsFirebase.listenMyTags(uid);
        wumf.com.sharedapps.firebase.UsersFirebase.listenPhoneNumber(uid);
        wumf.com.sharedapps.firebase.FavouriteAppsFirebase.listenFoldersAndApps(uid);
    }
    wumf.com.sharedapps.CurrentUser.currentUser = user;
    org.greenrobot.eventbus.EventBus.getDefault().post(new wumf.com.sharedapps.eventbus.CurrentUserChangedEvent(((wumf.com.sharedapps.CurrentUser.currentUser) == null ? null : wumf.com.sharedapps.CurrentUser.currentUser.getUid())));
}