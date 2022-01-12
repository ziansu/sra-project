void drawArrow(com.github.rinde.rinsim.geom.Point from, com.github.rinde.rinsim.geom.Point to, double width, double height) {
    final com.github.rinde.rinsim.geom.Point left = com.github.rinde.rinsim.ui.renderers.PointUtil.perp(to, from, height, (width / 2.0));
    final com.github.rinde.rinsim.geom.Point right = com.github.rinde.rinsim.ui.renderers.PointUtil.perp(to, from, height, (width / (-2.0)));
    drawLine(from, com.github.rinde.rinsim.ui.renderers.PointUtil.on(from, to, height));
    fillPolygon(left, right, to);
}