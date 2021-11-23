public void assignForm(int govid, sample.ApplicationData unAssignedForm) throws java.sql.SQLException {
    int resultCount;
    stmt = conn.createStatement();
    java.lang.String query = ((("UPDATE FORM SET FORM.STATUS = 'ASSIGNED', FORM.GOVID = " + govid) + " WHERE TTBID = '") + (unAssignedForm.getTtbID())) + "'";
    resultCount = stmt.executeUpdate(query);
}