@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        taskFragment = new neutronsoftwareinc.internetofthings.XMLParser.PlaceHolderFragment();
        getSupportFragmentManager().beginTransaction().add(taskFragment, "MyFragment").commit();
    }else {
        taskFragment = ((neutronsoftwareinc.internetofthings.XMLParser.PlaceHolderFragment) (getSupportFragmentManager().findFragmentByTag("MyFragment")));
    }
    taskFragment.startTask();
}