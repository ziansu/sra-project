@java.lang.Override
public void onClick(android.view.View v) {
    edu.gatech.ledpathways.androidemployeeapp.EmployeeDisturbActivity.progressDialog = new android.app.ProgressDialog(this);
    edu.gatech.ledpathways.androidemployeeapp.EmployeeDisturbActivity.progressDialog.setCancelable(false);
    edu.gatech.ledpathways.androidemployeeapp.EmployeeDisturbActivity.progressDialog.setMessage("Submitting your schedule...");
    edu.gatech.ledpathways.androidemployeeapp.EmployeeDisturbActivity.progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    edu.gatech.ledpathways.androidemployeeapp.EmployeeDisturbActivity.progressDialog.show();
    java.util.Collections.sort(edu.gatech.ledpathways.androidemployeeapp.EmployeeDisturbActivity.times);
    edu.gatech.ledpathways.androidemployeeapp.objects.Schedule schedule = new edu.gatech.ledpathways.androidemployeeapp.objects.Schedule(edu.gatech.ledpathways.androidemployeeapp.EmployeeDisturbActivity.times);
    sendSchedule(schedule, edu.gatech.ledpathways.androidemployeeapp.EmployeeDisturbActivity.progressDialog, statusView);
}