@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    layoutInflater = getLayoutInflater();
    prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    com.pyrotemplar.kickballreferee.MainActivity.undoStack = new java.util.Stack<>();
    com.pyrotemplar.kickballreferee.MainActivity.initializeCountFields();
    setupButtons();
}