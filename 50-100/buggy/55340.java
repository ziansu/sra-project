@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.parse.ParseObject.registerSubclass(com.example.ruoxilu.criticalmass.MassUser.class);
    com.parse.ParseObject.registerSubclass(com.example.ruoxilu.criticalmass.MassEvent.class);
    com.parse.ParseObject.registerSubclass(com.example.ruoxilu.criticalmass.Comment.class);
    com.parse.Parse.initialize(this, "ADIzf9tA1P4KQFL1AyyAKoCjLKhgaCmaZTmp96CL", "PcefekoiDoE3uR2yUd932HRbPPqrEGJyaE61aPVF");
    com.parse.ParseUser.enableAutomaticUser();
    android.util.Log.d("CriticalMassApplication", ("On start the currentuser is " + (com.parse.ParseUser.getCurrentUser())));
    com.parse.ParseUser.getCurrentUser().saveInBackground();
    setParseACL();
}