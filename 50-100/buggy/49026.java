public java.util.List<com.jaspersoft.android.sdk.service.data.schedule.JobUnit> transform(java.util.List<com.jaspersoft.android.sdk.network.entity.schedule.JobUnitEntity> entities, java.text.SimpleDateFormat dateTimeFormat) {
    java.util.List<com.jaspersoft.android.sdk.service.data.schedule.JobUnit> list = new java.util.ArrayList(entities.size());
    for (com.jaspersoft.android.sdk.network.entity.schedule.JobUnitEntity entity : entities) {
        if (entity != null) {
            com.jaspersoft.android.sdk.service.data.schedule.JobUnit unit = transform(entity, dateTimeFormat);
            list.add(unit);
        }
    }
    return list;
}