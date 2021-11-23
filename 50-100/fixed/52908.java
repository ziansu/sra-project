private void backpropagate(Node node, float score) {
    node.setScore((((node.getScore()) * (node.getNumVisits())) + score));
    node.addVisit();
    if ((node.getParent()) != null) {
        backpropagate(node.getParent(), score);
    }
}