@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mNavigationDrawerFragment = ((babymonitor.example.com.babymonitor.NavigationDrawerFragment) (getSupportFragmentManager().findFragmentById(R.id.navigation_drawer)));
    mTitle = getTitle();
    mNavigationDrawerFragment.setUp(R.id.navigation_drawer, ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))));
    android.content.Intent i = new android.content.Intent(getApplicationContext(), babymonitor.example.com.babymonitor.services.NotificationService.class);
    i.putExtra("KEY1", "Value to be used by the service");
    getApplicationContext().startService(i);
}