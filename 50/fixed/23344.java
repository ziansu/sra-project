public boolean allCoordinatesInEnvelope(java.util.List<com.example.noah.onthefly.models.Coordinate> envelope) {
    return (com.example.noah.onthefly.models.WeightAndBalance.coordinateInEnvelope(startCoordinate, envelope)) && (com.example.noah.onthefly.models.WeightAndBalance.coordinateInEnvelope(endCoordinate, envelope));
}