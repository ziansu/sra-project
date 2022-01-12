public boolean isValidStartingPosition(com.chesspionage.model.RankAndFile coordinate) {
    if (java.util.Arrays.asList(1, 2, 7, 8).contains(((coordinate.getRank()) + 1))) {
        if ((((coordinate.getFile()) + 1) > 0) && (((coordinate.getFile()) + 1) <= 8)) {
            return true;
        }
    }
    return false;
}