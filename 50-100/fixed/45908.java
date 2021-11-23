@org.junit.Test
public void getFriendsTest() {
    java.lang.String[] expectedFriends = new java.lang.String[]{ "TestUser" };
    java.lang.String[] actualFriends = userDataGuard.getFriends("BillyBob");
    java.util.Arrays.sort(expectedFriends);
    java.util.Arrays.sort(actualFriends);
    assertArrayEquals(actualFriends, expectedFriends);
}