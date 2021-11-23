@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.util.ArrayList<moanainc.com.moana.model.report.HistoryReport> newReportList = new java.util.ArrayList<>();
    moanainc.com.moana.firebase.FirebaseInterface.historyReports.clear();
    for (com.google.firebase.database.DataSnapshot child : dataSnapshot.getChildren()) {
        moanainc.com.moana.firebase.FirebaseInterface.historyReports.add(((moanainc.com.moana.model.Report) (child.getValue(moanainc.com.moana.model.report.HistoryReport.class))));
    }
}