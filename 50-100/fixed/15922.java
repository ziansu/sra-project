@java.lang.Override
public void done(com.parse.ParseUser user, com.parse.ParseException err) {
    if (user == null) {
        android.util.Log.d("MyApp", "Uh oh. The user cancelled the Facebook login.");
    }else
        if (user.isNew()) {
            android.util.Log.d("MyApp", "User signed up and logged in through Facebook!");
            getUserDetailsFromFB(user);
        }else {
            android.util.Log.d("MyApp", "User logged in through Facebook!");
            getUserDetailsFromParse();
        }
    
}