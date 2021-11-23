private com.teamagam.gimelgimel.domain.alerts.entity.Alert convertAlertData(com.teamagam.gimelgimel.data.alerts.entity.AlertData content, java.lang.String id) {
    com.teamagam.gimelgimel.domain.map.entities.mapEntities.AlertEntity entity = mGeoEntityDataMapper.transformIntoAlertEntity(id, content.source, content.location, content.severity);
    return new com.teamagam.gimelgimel.domain.alerts.entity.Alert(content.source, content.time, content.text, content.severity, id, entity);
}