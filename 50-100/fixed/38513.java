@org.junit.Test
public void defaultResponseIsReturnedWhenNoGroupsExist() throws java.lang.Exception {
    final java.lang.String newId = com.coursesketch.test.utilities.DatabaseHelper.createNonExistentObjectId(coursesketch.database.auth.DbAuthCheckerTest.VALID_ITEM_ID);
    insertValidObject(coursesketch.database.auth.DbAuthCheckerTest.VALID_ITEM_TYPE, newId);
    protobuf.srl.services.authentication.Authentication.AuthResponse response = authChecker.isAuthenticated(coursesketch.database.auth.DbAuthCheckerTest.VALID_ITEM_TYPE, newId, coursesketch.database.auth.DbAuthCheckerTest.TEACHER_ID, Authentication.AuthType.newBuilder().setCheckAccess(true).build());
    new com.coursesketch.test.utilities.ProtobufComparisonBuilder().setIgnoreSetDefaultFields(false).build().equals(Authentication.AuthResponse.getDefaultInstance(), response);
}