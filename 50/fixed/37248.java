@java.lang.Override
public void paint(java.awt.Graphics g) {
    com.darksouls.rougelike.utility.LogHelper.comment("canvas.paint");
    java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
    drawLevel(g2);
}