@java.lang.Override
public org.septa.android.app.domain.StopModel getCurrentItemFromCursor(android.database.Cursor cursor) {
    org.septa.android.app.domain.StopModel stopModel = new org.septa.android.app.domain.StopModel(cursor.getString(0), cursor.getString(1), ((cursor.getInt(4)) == 1), cursor.getString(2), cursor.getString(3));
    return stopModel;
}