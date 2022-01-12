public void fillPointMsg(GlobalNavigation.GUIPointMsg msg, java.awt.geom.Point2D.Double point, java.awt.Color color, long shape) {
    msg.x = ((float) (point.getX()));
    msg.y = ((float) (point.getY()));
    GlobalNavigation.ColorMsg colorMsg = new GlobalNavigation.ColorMsg();
    colorMsg.r = color.getRed();
    colorMsg.g = color.getGreen();
    colorMsg.b = color.getBlue();
    msg.color = colorMsg;
}