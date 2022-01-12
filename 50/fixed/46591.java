public void draw(java.awt.Graphics g, int x, int y) {
    if ((pixGrid) == null) {
        setMyPixels();
    }
    g.drawImage(buildPixels(pixGrid), x, y, null);
}