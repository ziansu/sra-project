@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_show);
    try {
        android.support.v4.app.Fragment fragment = ((android.support.v4.app.Fragment) (java.lang.Class.forName(getIntent().getStringExtra("fragment")).newInstance()));
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container, fragment).commit();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}