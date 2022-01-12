private boolean isAllSpotsTaken() {
    boolean result = false;
    for (int i = 0; i < (gameBoard.size()); i++) {
        for (int j = 0; j < (gameBoard.get(i).size()); j++) {
            if (gameBoard.get(i).get(j).equals(vacantSpotMarker)) {
                return false;
            }
        }
    }
    return result;
}