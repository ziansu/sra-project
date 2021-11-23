public void distributeStones(int selectedPit) {
    int stones = pits.get(selectedPit).getStones();
    for (int j = 1; j <= stones; j++) {
        if (j == 13) {
            stones = stones - 13;
            j = -1;
        }
        com.wirecard.scd.kalaha.domain.Pit currentPit = pits.get((selectedPit + j));
        currentPit.setStones(((currentPit.getStones()) + 1));
    }
}