public static void paintMultiMaps(java.awt.Graphics2D g2, com.wpi.cs509.teamA.bean.Path path, com.wpi.cs509.teamA.util.LinearTransform plt) {
    if ((null == path) || ((path.getNodes().size()) == 0)) {
        return ;
    }
    com.wpi.cs509.teamA.util.PaintHelper.PaintHelperComposite.paintPath(path, g2, plt);
    com.wpi.cs509.teamA.util.PaintHelper.PaintHelperComposite.paintNodes(path.getNodes(), g2, PaintHelperBasics.DrawStyleEnum.BasicNode, plt);
    com.wpi.cs509.teamA.util.PaintHelper.PaintHelperComposite.paintStartEndNode(g2, path, plt);
}