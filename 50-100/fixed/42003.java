@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if ((controller.MainActivity.currentIntent) == null) {
        android.content.Intent intentNearby = new android.content.Intent(this, controller.NearbySearchActivity.class);
        startActivity(intentNearby);
    }else {
        startActivity(controller.MainActivity.currentIntent);
    }
}