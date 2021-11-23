@java.lang.Override
public void run() {
    ecgDatabase.beginTransaction();
    try {
        for (int cnt = 0; cnt < 500; cnt++) {
            ecgDatabase.execSQL("INSERT INTO ecg VALUES(null, ?, ?)", new java.lang.Object[]{ ecgDataTemp[cnt].getValue() , ecgDataTemp[cnt].getRecordTime() });
        }
        ecgDatabase.setTransactionSuccessful();
    } finally {
        ecgDatabase.endTransaction();
        ecgDataTemp[0] = newEcgData;
    }
}