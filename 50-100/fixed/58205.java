@java.lang.Override
public int loadDeviceSms(android.content.Context context, ru.tinted_knight.sberbanksms.main_model.OnProgressUpdateListener listener) {
    android.database.Cursor cursor = new ru.tinted_knight.sberbanksms.Message.MessageReader.DeviceInboxCursorMessageReader(context).read();
    if ((cursor.getCount()) == 0)
        return -1;
    
    mListener = listener;
    ru.tinted_knight.sberbanksms.main_model.SimpleModel.AsyncSmsSQLiteWriter parser = new ru.tinted_knight.sberbanksms.main_model.SimpleModel.AsyncSmsSQLiteWriter(context);
    parser.execute(cursor);
    return cursor.getCount();
}