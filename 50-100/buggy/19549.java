private static boolean willPreventCheck(java.util.HashMap<java.lang.String, java.lang.String> pieces, char kingColor, java.lang.String position) {
    for (java.util.Map.Entry<java.lang.String, java.lang.String> piece : pieces.entrySet()) {
        if ((piece.getValue().charAt(0)) == kingColor) {
            java.lang.String move = ((piece.getKey()) + " ") + position;
            if (new com.wizeline.chess.MoveValidator(move, pieces).validMove(kingColor))
                return true;
            
        }
    }
    return false;
}