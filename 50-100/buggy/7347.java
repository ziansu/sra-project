@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    com.example.sayli.nchs.getset.Logs point = listLogs.get(i);
    android.content.Intent startCallReport = new android.content.Intent(this, com.example.sayli.nchs.ReportCallStatus.class);
    startCallReport.putExtra("crn", point.getCrn());
    startCallReport.putExtra("mob", point.getCustNo());
    startActivity(startCallReport);
}