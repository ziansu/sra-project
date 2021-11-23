@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.google.firebase.auth.FirebaseAuth auth = com.google.firebase.auth.FirebaseAuth.getInstance();
    if ((auth.getCurrentUser()) != null) {
        startActivity(new android.content.Intent(this, compsci290.edu.duke.myeveryday.MainActivity.class));
        finish();
    }
    setContentView(R.layout.activity_auth);
    butterknife.ButterKnife.bind(this);
    android.util.Log.d("selected provider", ((getSelectedProviders()) + ""));
}