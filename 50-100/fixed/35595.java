public WorldImage makeImage() {
    WorldImage background = new RectangleImage(new Posn(50, 50), 100, 100, new java.awt.Color(255, 255, 255));
    Utils ut = new Utils();
    return ut.drawGraph(background, this.board);
}