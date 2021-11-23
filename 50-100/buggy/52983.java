@java.lang.Override
public void done(com.parse.ParseUser parseUser, com.parse.ParseException e) {
    showProgress(true);
    if (parseUser == null) {
    }else
        if (parseUser.isNew()) {
            getFacebookInfo();
        }else {
            startApp();
            android.util.Log.d(com.trytara.tara.LoginActivity.TAG, ("CURRENT USER: " + (parseUser.toString())));
        }
    
}