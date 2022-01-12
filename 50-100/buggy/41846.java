private void updatePiecePositions(final se.kth.speech.SpatialRegion source, final se.kth.speech.SpatialRegion target) {
    final se.kth.speech.SpatialMap<java.lang.Integer> piecePlacements = model.getElementPlacements();
    final java.util.Collection<java.lang.Integer> pieceIds = piecePlacements.getMinimalRegionElements().get(source);
    for (final java.lang.Integer pieceId : pieceIds) {
        model.placeElement(pieceId, target);
    }
    model.clearRegion(source);
    listeners.forEach(( listener) -> listener.updatePieceMoved(source, target));
}