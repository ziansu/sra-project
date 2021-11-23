@java.lang.Override
public void visit(com.teamagam.gimelgimel.domain.map.entities.geometries.PointGeometry pointGeometry) {
    com.teamagam.gimelgimel.domain.map.entities.symbols.PointSymbol symbol = new com.teamagam.gimelgimel.domain.map.entities.symbols.PointSymbol(false, mMessageType);
    mResult = new com.teamagam.gimelgimel.domain.map.entities.mapEntities.PointEntity(com.teamagam.gimelgimel.domain.messages.SendGeoMessageInteractor.CreateGeoEntityVisitor.NOT_USED_ID, com.teamagam.gimelgimel.domain.utils.TextUtils.trim(mMessageText), pointGeometry, symbol);
}