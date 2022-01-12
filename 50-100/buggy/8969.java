@java.lang.Override
public void done(com.parse.ParseUser parseUser, com.parse.ParseException e) {
    if (parseUser == null) {
    }else
        if (parseUser.isNew()) {
            getFacebookInfo();
        }else {
            android.util.Log.d(com.trytara.tara.LoginActivity.TAG, ("CURRENT USER: " + (parseUser.toString())));
            finish();
        }
    
}