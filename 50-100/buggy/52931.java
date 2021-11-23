@java.lang.Override
public long insert(@android.support.annotation.NonNull
io.keepcoding.madridguide.model.Activity activity) {
    if (activity == null) {
        return 0;
    }
    db.beginTransaction();
    long id = DBHelper.INVALID_ID;
    try {
        id = db.insert(io.keepcoding.madridguide.manager.db.DBConstants.Activity.TABLE_ACTIVITY, io.keepcoding.madridguide.manager.db.DBConstants.Activity.KEY_ACTIVITY_NAME, this.getContentValues(activity));
        activity.setId(id);
        db.setTransactionSuccessful();
    } finally {
        db.endTransaction();
    }
    return id;
}