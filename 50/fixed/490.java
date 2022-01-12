@org.junit.Test
public void getUser() {
    int userId = 1;
    no.ntnu.stud.minvakt.data.User obtainedUser = no.ntnu.stud.minvakt.database.UserDBManagerTest.userDB.getUserById(userId);
    boolean successObtain = false;
    if (obtainedUser != null) {
        successObtain = true;
    }
    org.junit.Assert.assertTrue(successObtain);
}