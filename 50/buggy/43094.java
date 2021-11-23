@java.lang.Override
public void done(com.parse.ParseUser user, com.parse.ParseException e) {
    if (e != null) {
        navigateToLogin();
    }
}