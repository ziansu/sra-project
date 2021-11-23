public static void createTable(net.sqlcipher.database.SQLiteDatabase database) {
    database.execSQL(org.smartregister.immunization.repository.RecurringServiceRecordRepository.CREATE_TABLE_SQL);
    database.execSQL(org.smartregister.immunization.repository.RecurringServiceRecordRepository.BASE_ENTITY_ID_INDEX);
    database.execSQL(org.smartregister.immunization.repository.RecurringServiceRecordRepository.RECURRING_SERVICE_ID_INDEX);
    database.execSQL(org.smartregister.immunization.repository.RecurringServiceRecordRepository.EVENT_ID_INDEX);
    database.execSQL(org.smartregister.immunization.repository.RecurringServiceRecordRepository.FORMSUBMISSION_INDEX);
    database.execSQL(org.smartregister.immunization.repository.RecurringServiceRecordRepository.UPDATED_AT_INDEX);
}