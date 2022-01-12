@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (!(com.ucsd.cse110.recipeforsuccess.MainActivity.bParseInitialized)) {
        com.parse.Parse.enableLocalDatastore(this);
        com.parse.Parse.initialize(this);
        com.ucsd.cse110.recipeforsuccess.MainActivity.bParseInitialized = true;
    }
    layoutButtons();
    setRecipeSearchActive();
    handleIntent(getIntent());
}