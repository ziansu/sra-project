public void disseminateBattles(java.util.ArrayList<swissTournamentRunner.Battle> battles) {
    for (swissTournamentRunner.Battle b : battles) {
        swissTournamentRunner.Player p1 = b.getP1();
        swissTournamentRunner.Player p2 = b.getP2();
        players.add(p1);
        players.add(p2);
        b = null;
    }
    battles.clear();
}