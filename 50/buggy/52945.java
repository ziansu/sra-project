public void updateDayBrief(com.android.egg.dreamnote.basetype.DayBrief dayBrief) {
    mContext.getContentResolver().update(NoteProvider.CONTENT_URI_DB_DAY_BRIEF, dayBrief.toContentValues(true), (((com.android.egg.dreamnote.storage.NoteDatabaseHelper.DB_TBL_DAY_BRIEF_TIME_OFST) + "=") + (dayBrief.getTimeOffset())), null);
}