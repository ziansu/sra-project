@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.parse.ParseCrashReporting.enable(this);
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.ParseObject.registerSubclass(com.parse.starter.Event.class);
    com.parse.ParseObject.registerSubclass(com.parse.starter.Tab.class);
    com.parse.ParseObject.registerSubclass(com.parse.starter.Post.class);
    com.parse.Parse.initialize(this, "6yME94t22PAckT61vJXKbC5HtcRFqenDVBMLboD9", "cA242AT2n20dzyueOqL5p5nYXTceiaHKEMJvruwJ");
    com.parse.ParseUser.enableAutomaticUser();
    com.parse.ParseACL defaultACL = new com.parse.ParseACL();
    com.parse.ParseACL.setDefaultACL(defaultACL, true);
}