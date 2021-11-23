private int getAreaExplored() {
    int total = 0;
    for (int i = 0; i < (mdp.Constants.MAX_Y); i++) {
        for (int j = 0; j < (mdp.Constants.MAX_X); j++) {
            if (map.getCoordinate(i, j).getIsExplored()) {
                total++;
            }
        }
    }
    return total;
}