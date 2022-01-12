public static javax.swing.ImageIcon getScaledIcon(java.awt.Image img, int maxWidth, int maxHeight) {
    img = pt.lsts.neptus.util.ImageUtils.getScaledImage(img, maxWidth, maxHeight, false);
    try {
        return new javax.swing.ImageIcon(img);
    } catch (java.lang.Exception e) {
        pt.lsts.neptus.NeptusLog.pub().error(e.getStackTrace());
        return new javax.swing.ImageIcon(pt.lsts.neptus.util.ImageUtils.getImage("images/menus/no.png"));
    }
}