@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.ParseObject.registerSubclass(com.example.cmput401.classdiscuss.Message.class);
}