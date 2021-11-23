public void reportToDataBase(Model.Report report) {
    try {
        nrm.reportToDataBase(report, con);
    } catch (java.sql.SQLException ex) {
        java.lang.System.out.println(("Error in creating a report, No changes in the database" + ex));
    }
}