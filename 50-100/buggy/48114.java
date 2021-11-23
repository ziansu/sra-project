@java.lang.Override
public void onStart() {
    super.onStart();
    if (!(((com.example.jingleski.smartlapp.MyApplication) (this.getApplication())).isFirebaseConnection())) {
        android.content.Intent signInIntent = ((com.example.jingleski.smartlapp.MyApplication) (this.getApplication())).getSignInIntent();
        startActivityForResult(signInIntent, MyApplication.RC_SIGN_IN);
    }
    ((com.example.jingleski.smartlapp.MyApplication) (this.getApplication())).readData(this);
}