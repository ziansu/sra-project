public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    for (Prey each : preys) {
        each.display(g);
    }
    for (Predator each : predators) {
        each.display(g);
    }
    for (Strawberry each : strawberries) {
        each.display(g);
    }
    for (Mushroom each : mushrooms) {
        each.display(g);
    }
}