@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    com.wpi.cs509.teamA.bean.GeneralMap map = model.getCurrentMap();
    image = map.getImage();
    float scale = map.getDisplayScale();
    if (!(testBeforeRepaint()))
        return ;
    
    java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
    com.wpi.cs509.teamA.util.PaintHelper.paintEverything(g2, map, image, scale);
    model.paintOnImage(g2);
    g2 = null;
}