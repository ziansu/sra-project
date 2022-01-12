@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
    g2.setColor(java.awt.Color.white);
    g2.fillRect(0, 0, getWidth(), getHeight());
    drawRadarChart(g2);
}