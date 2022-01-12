@java.lang.Override
public void onClick(android.view.View v) {
    showProgress(true);
    com.parse.ParseFacebookUtils.logInWithReadPermissionsInBackground(this, java.util.Arrays.asList("user_location, email, user_birthday"), new com.parse.LogInCallback() {
        @java.lang.Override
        public void done(com.parse.ParseUser parseUser, com.parse.ParseException e) {
            if (parseUser == null) {
            }else
                if (parseUser.isNew()) {
                    getFacebookInfo();
                }else {
                    android.util.Log.d(com.trytara.tara.LoginActivity.TAG, ("CURRENT USER: " + (parseUser.toString())));
                }
            
        }
    });
}