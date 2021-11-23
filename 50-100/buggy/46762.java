@org.junit.Test
public void getUsersResultsFindTestUser() {
    user.UserSearch searcher = new user.UserSearch("testuser1");
    java.util.ArrayList<user.User> users = ((java.util.ArrayList<user.User>) (searcher.getUsers()));
    org.junit.Assert.assertTrue(((users.size()) == 1));
}