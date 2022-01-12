public long setIsFavorite(long mediaId, boolean isFavorite) {
    initialValues.clear();
    initialValues.put(Remindersinfo.MEDIA_ID, mediaId);
    initialValues.put(Remindersinfo.REMINDER_ENABLED, sanitiseBooleanToInteger(isFavorite));
    initialValues.put(Remindersinfo.IS_FAVORITE_FLAG, sanitiseBooleanToInteger(isFavorite));
    return mDb.replace(Remindersinfo.TABLE_NAME, null, initialValues);
}