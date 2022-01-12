public void refreshPlayers() {
    for (int k = 0; k < (players.size()); k++) {
        Player person = players.get(k);
        if (person != null) {
            for (Unit unit : person.getUnitList()) {
                unit.refreshAction();
            }
        }
    }
}