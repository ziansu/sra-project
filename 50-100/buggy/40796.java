public boolean isValidStartingPosition(com.chesspionage.model.RankAndFile coordinate) {
    if (java.util.Arrays.asList(1, 2, 7, 8).contains(coordinate.getRank())) {
        if (((coordinate.getFile()) > 0) && ((coordinate.getFile()) <= 8)) {
            return true;
        }
    }
    return false;
}