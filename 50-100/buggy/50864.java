public void fillPointMsg(GlobalNavigation.GUIPointMsg msg, java.awt.geom.Point2D.Double point, java.awt.Color color, long shape) {
    msg.x = ((float) (point.getX()));
    msg.y = ((float) (point.getY()));
    GlobalNavigation.ColorMsg colorMsg = new GlobalNavigation.ColorMsg();
    colorMsg.r = c.getRed();
    colorMsg.g = c.getGreen();
    colorMsg.b = c.getBlue();
    msg.color = colorMsg;
}