public void refreshPlayers() {
    for (int k = 0; k < (players.size()); k++) {
        Player person = players.get(k);
        for (Unit unit : person.getUnitList()) {
            unit.refreshAction();
        }
    }
}