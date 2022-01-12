@java.lang.Override
public android.database.Cursor loadInBackground() {
    android.database.Cursor cursor = db.getUserFood();
    return cursor;
}