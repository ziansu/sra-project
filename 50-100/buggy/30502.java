public void paintComponent(java.awt.Graphics g) {
    g.setColor(java.awt.Color.black);
    g.drawImage(GamePanel.MazeImg, 0, 0, 961, 488, null);
    g.drawImage(GamePanel.WallImg, 10, 510, 10, 10, null);
    g.drawImage(GamePanel.pacmanImg, 10, 10, 2, 2, null);
    object.draw(g);
    java.lang.System.out.println("paint");
}