private void canWePlay() {
    if (((players.size()) < 2) || (players.isEmpty())) {
        warningLabel.setText("Det måste vara minst två spelare!");
        players.clear();
    }
    if (hasSameName) {
        warningLabel.setText("Alla spelare måste ha olika namn.");
        players.clear();
    }
}