void playOneSequence() {
    Montecarlo.Node node = selectNode(root);
    node = expand(node);
    int winner = simulation(node);
    backPropagation(node, winner);
}