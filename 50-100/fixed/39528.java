@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_homescreen);
    txtClubName = ((android.widget.TextView) (findViewById(R.id.home_clubName)));
    txtClubName.setText(((((com.milan.recreationapp.ReCreationApplication) (getApplication())).sharedPreferences.getString("club", "").toUpperCase()) + "\n TIMETABLE"));
}