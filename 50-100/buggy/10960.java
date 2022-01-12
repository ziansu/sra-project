public static com.drewhannay.chesscrafter.models.PieceType getKingPieceType() {
    java.util.Map<com.drewhannay.chesscrafter.models.Direction, java.lang.Integer> movements = com.google.common.collect.Maps.newHashMap();
    for (com.drewhannay.chesscrafter.models.Direction direction : com.drewhannay.chesscrafter.models.Direction.values()) {
        movements.put(direction, 1);
    }
    return new com.drewhannay.chesscrafter.models.PieceType("King", movements, null, null);
}