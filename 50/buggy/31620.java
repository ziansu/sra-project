@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    moanainc.com.moana.firebase.FirebaseInterface.availibilityReports.clear();
    for (com.google.firebase.database.DataSnapshot child : dataSnapshot.getChildren()) {
        moanainc.com.moana.firebase.FirebaseInterface.availibilityReports.add(((moanainc.com.moana.model.Report) (child.getValue(moanainc.com.moana.model.report.AvailReport.class))));
    }
}