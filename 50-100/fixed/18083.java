@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        android.app.Fragment fragment = (getUserToken().isEmpty()) ? new com.oryanmat.trellowidget.activity.LoginFragment() : new com.oryanmat.trellowidget.activity.LoggedInFragment();
        getFragmentManager().beginTransaction().add(R.id.fragment_container, fragment).commit();
    }
}