@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_location_detailed);
    initTabControl();
    context = this;
    android.app.Activity activity = ((android.app.Activity) (context));
    activity.getActionBar().setTitle("Hier muss der Kneipenname stehen.");
    android.os.Bundle b = getIntent().getExtras();
    currLocationID = b.getInt("LocationID");
    getLocationDetails();
}