@org.junit.Test
public void getUsersResultsNotEmpty() {
    user.UserSearch searcher = new user.UserSearch("");
    java.util.ArrayList<user.User> users = ((java.util.ArrayList<user.User>) (searcher.getUsers()));
    org.junit.Assert.assertTrue(((users.size()) > 0));
}