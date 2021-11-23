@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.support.v7.app.AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    setHasOptionsMenu(true);
    setRetainInstance(true);
    android.os.Bundle bundle = this.getArguments();
    username = bundle.getString("name");
    photourl = bundle.getString("photoUrl");
}