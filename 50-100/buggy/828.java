public void insertData(java.lang.String vKONTACT_PERSON, java.lang.String vSTARTSAT, int vREPEATSNR, java.lang.String vREPEATSINTERVAL, java.lang.String vUNSHARPEN, int vUNSHARPENNR, java.lang.String vRADOMDATE) {
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    db.execSQL(("INSERT INTO Reminder_tabledb(CONTACT_PERSON,STARTSAT,REPEATSNR,REPEATSINTERVAL,UNSHARPEN,UNSHARPENNR,RADOMDATE)" + "values (?,?,?,?,?,?,?)"), new java.lang.Object[]{ vKONTACT_PERSON , vSTARTSAT , vREPEATSNR , vREPEATSINTERVAL , vUNSHARPEN , vUNSHARPENNR , vRADOMDATE });
}