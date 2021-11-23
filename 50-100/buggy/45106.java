@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.ParseObject.registerSubclass(com.pressthatbutton.thirtysecondsmash.UserScore.Score.class);
    com.parse.ParseObject.registerSubclass(com.parse.ParseUser.class);
    com.parse.ParseObject.registerSubclass(com.parse.ParseSession.class);
    com.pressthatbutton.thirtysecondsmash.AppParse._parseUser = new com.parse.ParseUser();
    com.pressthatbutton.thirtysecondsmash.AppParse._parseUser.setUsername("Unknown User");
    com.pressthatbutton.thirtysecondsmash.AppParse._parseSession = new com.parse.ParseSession();
    com.parse.Parse.initialize(this, ApplicationID, ClientKey);
    com.parse.ParseFacebookUtils.initialize(this);
    com.parse.ParseInstallation.getCurrentInstallation().saveInBackground();
}