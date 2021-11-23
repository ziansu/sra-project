@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.schedule_screen);
    list = com.example.myothiha09.coursehelper.fragment.ScheduleOverviewFragment.getCurrent();
    view = new android.view.View(this);
    com.example.myothiha09.coursehelper.controller.Boast.makeText(getApplicationContext(), "Click back to go back", Toast.LENGTH_LONG).show();
    android.widget.TextView tv = ((android.widget.TextView) (findViewById(R.id.textTitle)));
    tv.setText(com.example.myothiha09.coursehelper.fragment.ScheduleOverviewFragment.getScheduleNumber());
    makeTimeTable(list);
}