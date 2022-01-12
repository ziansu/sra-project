public void initialize() {
    estValues = new float[graph.length];
    sorted = new java.util.ArrayList<>();
    known = new java.util.ArrayList<>();
    for (int i = 0; i < (hand.getNumHole()); i++) {
        known.add(hand.getHoleCard(i));
    }
    updateKnownAndGraphAndValues();
    if (isInTop(graph[11], 1))
        java.lang.System.out.println("YES THIS IS TOP:");
    
    printIntel();
}