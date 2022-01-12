public void sendGeoMessage(java.lang.String senderId, java.lang.String messageText, double latitude, double longitude, double altitude, java.lang.String type) {
    com.teamagam.gimelgimel.domain.geometries.entities.PointGeometry geometry = new com.teamagam.gimelgimel.domain.geometries.entities.PointGeometry(latitude, longitude, altitude);
    com.teamagam.gimelgimel.domain.geometries.entities.GeoEntity geoEntity = createGeoEntity(((senderId + messageText) + type), geometry, type);
    com.teamagam.gimelgimel.domain.messages.entity.MessageGeo message = new com.teamagam.gimelgimel.domain.messages.entity.MessageGeo(senderId, geoEntity, messageText);
    mGeometryInteractor.addUserGeoEntity(message, new com.teamagam.gimelgimel.presentation.presenters.SendGeoEntityPresenter.GeoSubscriber());
}