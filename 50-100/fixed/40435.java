public void distributeStones(int selectedPit) {
    int stones = pits.get(selectedPit).getStones();
    for (int j = 1; j <= stones; j++) {
        if ((selectedPit + j) > 13) {
            selectedPit = selectedPit - (selectedPit + j);
        }
        com.wirecard.scd.kalaha.domain.Pit currentPit = pits.get((selectedPit + j));
        currentPit.setStones(((currentPit.getStones()) + 1));
    }
}