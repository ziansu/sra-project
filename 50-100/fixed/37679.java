@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_all_water_reports);
    allWaterReportsText = ((android.widget.TextView) (findViewById(R.id.all_reports_text)));
    allWaterReportsList = ((android.widget.ListView) (findViewById(R.id.all_reports_list)));
    reportsArrayList = team64.waterworks.controllers.ReportsManager.viewAllReports();
    if ((reportsArrayList) != null) {
        reportsArrayAdapter = new android.widget.ArrayAdapter(this, R.layout.activity_all_water_reports, reportsArrayList);
        allWaterReportsList.setAdapter(reportsArrayAdapter);
    }
}