@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_enter_data);
    android.content.Intent iReceive = getIntent();
    acceptStop(iReceive);
    acceptBlocks(iReceive);
    populateSpinner();
    initializeNumberPickers(savedInstanceState);
    createScoutStop();
}