public boolean UpdatePatient(com.example.m5.oximetergui.Data_Objects.Patient patient, java.lang.StringBuilder sb) {
    try {
        android.database.sqlite.SQLiteDatabase db = _dal.getWritableDatabase();
        java.lang.String updateString = java.lang.String.format(SQL_Constants.UPDATE_PATIENT, patient.FirstName, patient.LastName, patient.DateOfBirth, (patient.IsOpen ? 1 : 0), patient.ID);
        db.execSQL(updateString);
    } catch (java.lang.Exception e) {
        sb.append(e.getMessage());
        return false;
    }
    return true;
}