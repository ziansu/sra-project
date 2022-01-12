private java.util.ArrayList<pt.tecnico.aasma.beliefs.Belief> beliefRevision() {
    java.util.ArrayList<pt.tecnico.aasma.beliefs.Belief> newBeliefs = new java.util.ArrayList<>();
    newBeliefs.add(new pt.tecnico.aasma.beliefs.SeeingEnemy(players.getNearestVisibleEnemy()));
    return newBeliefs;
}