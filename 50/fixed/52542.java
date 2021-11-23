private int getMoegAbs() {
    int summe = 0;
    for (de.OFactory.SchokoFactory.simulation.Player p : players) {
        p.calculateMoegAbs();
        summe += p.getMoegAbs();
    }
    return summe;
}