private void insertCommandAction(com.calimero.knx.knxvc.VoiceCommand voicecommand) {
    android.content.ContentValues values;
    for (com.calimero.knx.knxvc.core.KnxAction action : voicecommand.getActions()) {
        values = new android.content.ContentValues();
        values.put(DatabaseHelper.COL_COMMAND_ID, java.lang.String.valueOf(voicecommand.getId()));
        values.put(DatabaseHelper.COL_ACTION_ID, java.lang.String.valueOf(action.getId()));
        database.insert(DatabaseHelper.TABLE_COMMAND_ACTION, null, values);
    }
}