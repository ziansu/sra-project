public void updateStats() {
    ray = (ray) * (Utils.Global.ratioH);
    ostr.setCenterX(((ostr.getCenterX()) * (Utils.Global.ratioW)));
    ostr.setCenterY(((ostr.getCenterY()) * (Utils.Global.ratioH)));
    ostr = new org.newdawn.slick.geom.Circle(ostr.getCenterX(), ostr.getCenterY(), ray);
    maxW = (maxW) * (Utils.Global.ratioW);
    maxH = (maxH) * (Utils.Global.ratioH);
}