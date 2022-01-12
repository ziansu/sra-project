@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_diary);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    getSupportFragmentManager().beginTransaction().add(R.id.fragmentDayContainer, michalchojnacki.bodybuilder.diary.day.DayFragment.newInstance(java.util.Calendar.getInstance().getTime(), new java.util.LinkedList<michalchojnacki.bodybuilder.diary.Training>())).commit();
}