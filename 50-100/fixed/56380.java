public static com.mobile.app.myacl.UserManager.UserProfile getInstance(android.content.Context context) {
    if ((com.mobile.app.myacl.UserManager.UserProfile.instance) == null) {
        com.mobile.app.myacl.DatabaseManager.UserDB uDB = new com.mobile.app.myacl.DatabaseManager.UserDB(context);
        uDB.open();
        com.mobile.app.myacl.UserManager.UserProfile.instance = new com.mobile.app.myacl.UserManager.UserProfile();
        uDB.openUserProfile(com.mobile.app.myacl.UserManager.UserProfile.instance);
        uDB.close();
    }
    return com.mobile.app.myacl.UserManager.UserProfile.instance;
}