public java.util.List<rl.adapters.learners.PersistentLearner> getPlayers() {
    if ((players) == null) {
        if ((playerNodes.size()) < 2) {
            throw new java.lang.RuntimeException("You must specify at least two players.");
        }
        players = new java.util.ArrayList<>();
        for (org.w3c.dom.Node n : playerNodes) {
            java.lang.System.out.println(n);
            java.lang.System.out.println(players);
            players.add(processPlayerNode(n));
        }
    }
    return players;
}