@android.annotation.SuppressLint(value = "MissingSuperCall")
@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState, de.aw.reports.ActivityReports.layout);
    try {
        mReportStammdaten = new de.aw.gv.ReportStammdaten(de.aw.database.DBHelper.getDatabase(), args.getLong(de.aw.reports.ID));
        if (savedInstanceState == null) {
            showFragments();
        }
    } catch (de.aw.gv.GeschaeftsObjekt | java.text.ParseException e) {
        e.printStackTrace();
        finish();
    }
}