@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    createNewSemester();
    java.lang.String sDate = "Start Date: " + (data.ActiveSemester().getStartdate());
    java.lang.String eDate = "End Date: " + (data.ActiveSemester().getEnddate());
    java.lang.String nWeeks = "Number of Weeks: " + (data.ActiveSemester().numWeeks);
    startDateText.setText(sDate);
    endDateText.setText(eDate);
    numWeeksText.setText(nWeeks);
    startActivity(new android.content.Intent(this, com.example.samjc.timesheetwebclient.MainActivity.class));
}