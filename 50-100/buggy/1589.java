public static com.drewhannay.chesscrafter.models.PieceType getQueenPieceType() {
    java.util.Map<com.drewhannay.chesscrafter.models.Direction, java.lang.Integer> movements = com.google.common.collect.Maps.newHashMap();
    for (com.drewhannay.chesscrafter.models.Direction direction : com.drewhannay.chesscrafter.models.Direction.values()) {
        movements.put(direction, com.drewhannay.chesscrafter.models.PieceType.UNLIMITED);
    }
    return new com.drewhannay.chesscrafter.models.PieceType("Queen", movements, null, null);
}