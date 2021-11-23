public config.SensorParams getSensor(java.lang.String idSensor) {
    fr.unice.smart_campus.middleware.config.BasicDBObject query = new fr.unice.smart_campus.middleware.config.BasicDBObject(config.SensorParams.NAME_COLUMN, idSensor);
    fr.unice.smart_campus.middleware.config.Cursor cursor = coll.find();
    try {
        while (cursor.hasNext()) {
            return new config.SensorParams(cursor.next());
        } 
    } finally {
        cursor.close();
    }
    return null;
}