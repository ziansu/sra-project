public static void main(java.lang.String[] args) {
    Grid g = new Grid();
    GridDisplay gd = new GridDisplay(g);
    g.registerDisplay(gd);
    javax.swing.JFrame frame = new javax.swing.JFrame("2D Grid Search");
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.add(gd);
    frame.pack();
    frame.setResizable(false);
    frame.setVisible(true);
    BreadthFirstGraphSearch.search(g, new Coord(3, 3));
}