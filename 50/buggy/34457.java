private long addSensorToDB(com.example.ludvig.sens.SensorDBItem sensor, android.database.sqlite.SQLiteDatabase db) {
    return nl.qbusict.cupboard.CupboardFactory.cupboard().withDatabase(db).put(sensor);
}