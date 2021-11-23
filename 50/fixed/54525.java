public static void paintMultiMaps(java.awt.Graphics2D g2, com.wpi.cs509.teamA.bean.GeneralMap map) {
    com.wpi.cs509.teamA.util.PaintHelper.paintRoute(g2, map);
    com.wpi.cs509.teamA.util.PaintHelper.paintIcons(map.getNodes(), g2, com.wpi.cs509.teamA.util.PaintHelper.DrawStyleEnum.BasicNode);
    com.wpi.cs509.teamA.util.PaintHelper.paintStartEndNode(g2, map);
}