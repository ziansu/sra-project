@org.junit.Test
public void getUsersResultsAllUsernamesNotEmpty() {
    user.UserSearch searcher = new user.UserSearch("");
    java.util.ArrayList<user.User> users = ((java.util.ArrayList<user.User>) (searcher.getUsers()));
    for (user.User user : users) {
        assertFalse("".equals(user.getUsername()));
        java.lang.System.out.println(user.getUsername());
    }
}