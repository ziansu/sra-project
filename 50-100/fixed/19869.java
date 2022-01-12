public void checkPlayer() {
    for (int k = 0; k < (players.size()); k++) {
        Player person = players.get(k);
        if (person != null) {
            if (((person.getUnitList().size()) == 0) && ((person.getAmountOfMoney()) < 100)) {
                players.set(k, null);
            }
        }
    }
}