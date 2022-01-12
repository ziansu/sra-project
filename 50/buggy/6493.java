public void paintComponent(java.awt.Graphics graph) {
    java.lang.System.out.println("Painting JPanel");
    java.awt.Graphics2D graph2D = ((java.awt.Graphics2D) (graph));
    this.view.draw(graph);
}