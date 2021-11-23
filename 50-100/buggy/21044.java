public void setTailNails(float[][] nailInfo) {
    if (null == nailInfo) {
        return ;
    }
    this.mTailNails.clear();
    for (float[] position : nailInfo) {
        if ((position.length) == 4) {
            com.alibaba.weex.plugin.gcanvas.bubble.BubblePosition bp = new com.alibaba.weex.plugin.gcanvas.bubble.BubblePosition(position);
            bp.disRightX = 0;
            bp.disRightY = 0;
            bp.scaleRightY = 1.0F;
            bp.scaleRightX = 1.0F;
            bp.isNail = true;
            this.mTailNails.add(bp);
        }
    }
    mIsPositionDirty = true;
}