@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.alarm_list);
    android.widget.ListView alarmList = ((android.widget.ListView) (findViewById(R.id.alarm_list)));
    adapter = new com.dmchoull.daybreak.ui.AlarmListAdapter(this, alarmHelper.getAll());
    alarmList.setAdapter(adapter);
    alarmList.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
        @java.lang.Override
        public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
            showAlarm(id);
        }
    });
}