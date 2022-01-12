public static com.drewhannay.chesscrafter.models.PieceType getRookPieceType() {
    java.util.Map<com.drewhannay.chesscrafter.models.Direction, java.lang.Integer> movements = com.google.common.collect.Maps.newHashMap();
    for (com.drewhannay.chesscrafter.models.Direction direction : Direction.ADJACENT_DIRECTIONS) {
        movements.put(direction, com.drewhannay.chesscrafter.models.PieceType.UNLIMITED);
    }
    return new com.drewhannay.chesscrafter.models.PieceType("Rook", movements, null);
}