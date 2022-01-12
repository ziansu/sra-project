@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.widget.TextView tvInfo = ((android.widget.TextView) (findViewById(R.id.app_info)));
    tvInfo.setText(getString(R.string.app_info));
    mHelper = new com.bjlanza.udacity.bj_habittracker.HabitDbHelper(this);
    db = mHelper.getWritableDatabase();
    insertData("Walking Dog", "21", "Pets");
    insertData("Programming one hour per day", "15", "Study");
    getData();
    deleteTable();
}