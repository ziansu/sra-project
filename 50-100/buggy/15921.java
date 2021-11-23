@org.junit.Before
public void before() throws java.lang.Exception {
    db = fongo.getDatabase();
    authChecker = new coursesketch.database.auth.DbAuthChecker(db);
    insertValidObject(coursesketch.database.auth.DbAuthCheckerTest.VALID_ITEM_TYPE, coursesketch.database.auth.DbAuthCheckerTest.VALID_ITEM_ID, coursesketch.database.auth.DbAuthCheckerTest.VALID_GROUP_ID);
    java.lang.String salt = null;
    try {
        salt = coursesketch.server.authentication.HashManager.generateSalt();
    } catch (java.security.NoSuchAlgorithmException e) {
        e.printStackTrace();
    }
    insertValidGroup(coursesketch.database.auth.DbAuthCheckerTest.VALID_GROUP_ID, coursesketch.database.auth.DbAuthCheckerTest.VALID_ITEM_ID, salt, createPermission(salt, coursesketch.database.auth.DbAuthCheckerTest.TEACHER_ID, Authentication.AuthResponse.PermissionLevel.TEACHER), createPermission(salt, coursesketch.database.auth.DbAuthCheckerTest.STUDENT_ID, Authentication.AuthResponse.PermissionLevel.STUDENT), createPermission(salt, coursesketch.database.auth.DbAuthCheckerTest.MOD_ID, Authentication.AuthResponse.PermissionLevel.MODERATOR));
}