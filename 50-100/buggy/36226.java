@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_timetable);
    this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    db = new com.studbud.studbud.TimeTable.TimetableDataBase(this);
    getInfoOfCourseToAdd();
    db.open();
    tgva = new com.studbud.studbud.TimeTable.TimetableGridViewAdapter(this, db.getSchedule().getContent().split(saveDataSeparator));
    db.close();
    initiateDb();
    getSchedule();
}