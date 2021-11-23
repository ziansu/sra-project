public void canWePlay() {
    if (hasSameName) {
        players.clear();
    }
    if (((players.size()) < 2) || (players.isEmpty())) {
        warningLabel.setText("Det måste vara minst två spelare!");
        players.clear();
    }
    if (hasSameName) {
        warningLabel.setText("Alla spelare måste ha olika namn.");
        players.clear();
    }
}