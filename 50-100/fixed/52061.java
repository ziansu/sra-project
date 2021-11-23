private void backPropagate(org.ggp.base.player.gamer.mygamers.MultiNode node, double score) {
    if ((((isSinglePlayer) && (bestPathFound)) && (!(node.isMax))) && ((node.parent) != null)) {
        p(("adding move: " + (node.move)));
        bestPathReversed.add(node.move);
    }
    node.utility += score;
    (node.visits)++;
    if (useUCBTuned)
        node.utilities.add(node.utility);
    
    if ((node.parent) != null) {
        backPropagate(node.parent, score);
    }
}