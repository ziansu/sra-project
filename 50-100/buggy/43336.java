@org.junit.Test
public void getUsersResultsEmpty() {
    user.UserSearch searcher = new user.UserSearch("DOES_NOT_EXIST");
    java.util.ArrayList<user.User> users = ((java.util.ArrayList<user.User>) (searcher.getUsers()));
    org.junit.Assert.assertTrue(((users.size()) == 0));
}