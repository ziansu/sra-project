@org.junit.AfterClass
public static void tearDownAfterClass() throws java.lang.Exception {
    if ((com.starbattle.tests.friends.FriendsTests.testEnvironment) != null) {
        com.starbattle.tests.friends.FriendsTests.testEnvironment.close();
    }
}