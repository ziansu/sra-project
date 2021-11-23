public void updateStats() {
    ray = (ray) * (Utils.Global.ratioH);
    ostr.setCenterX(((getX()) * (Utils.Global.ratioW)));
    ostr.setCenterY(((getY()) * (Utils.Global.ratioH)));
    ostr = new org.newdawn.slick.geom.Circle(ostr.getCenterX(), ostr.getCenterY(), ray);
    maxW = (maxW) * (Utils.Global.ratioW);
    maxH = (maxH) * (Utils.Global.ratioH);
}