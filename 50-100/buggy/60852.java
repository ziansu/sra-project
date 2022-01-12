@java.lang.Override
public org.septa.android.app.domain.StopModel getCurrentItemFromCursor(android.database.Cursor cursor) {
    org.septa.android.app.domain.StopModel stopModel = new org.septa.android.app.domain.StopModel(cursor.getString(0), cursor.getString(1), ((cursor.getInt(2)) == 1), cursor.getString(3), cursor.getString(4));
    stopModel.setStopSequence(cursor.getInt(5));
    return stopModel;
}