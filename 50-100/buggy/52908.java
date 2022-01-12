private void backpropagate(Node node, float score) {
    node.addVisit();
    node.setScore((((node.getScore()) * (node.getNumVisits())) + score));
    if ((node.getParent()) != null) {
        backpropagate(node.getParent(), score);
    }
}