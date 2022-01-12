@org.junit.Test
public void getUsersResultsNotEmpty() {
    user.UserSearch searcher = new user.UserSearch("");
    java.util.ArrayList<user.User> users = ((java.util.ArrayList<user.User>) (searcher.getUsers()));
    assertTrue(((users.size()) > 0));
}