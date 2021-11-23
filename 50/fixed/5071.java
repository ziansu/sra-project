public static void createTable(net.sqlcipher.database.SQLiteDatabase database) {
    database.execSQL(org.smartregister.immunization.repository.VaccineRepository.VACCINE_SQL);
    database.execSQL(org.smartregister.immunization.repository.VaccineRepository.BASE_ENTITY_ID_INDEX);
    database.execSQL(org.smartregister.immunization.repository.VaccineRepository.UPDATED_AT_INDEX);
}