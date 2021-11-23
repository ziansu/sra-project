@java.lang.Override
public void visit(com.teamagam.gimelgimel.domain.map.entities.geometries.Polyline polyline) {
    com.teamagam.gimelgimel.domain.map.entities.symbols.PolylineSymbol symbol = new com.teamagam.gimelgimel.domain.map.entities.symbols.PolylineSymbol(false);
    mResult = new com.teamagam.gimelgimel.domain.map.entities.mapEntities.PolylineEntity(com.teamagam.gimelgimel.domain.messages.SendGeoMessageInteractor.CreateGeoEntityVisitor.NOT_USED_ID, com.teamagam.gimelgimel.domain.utils.TextUtils.trim(mMessageText), polyline, symbol);
}