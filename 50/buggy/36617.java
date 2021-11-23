void setTopSibling(com.alibaba.weex.plugin.gcanvas.bubble.BubblePosition topSibling) {
    this.mTop = topSibling;
    if (null != (this.mTop)) {
        this.disTopY = (this.mTop.y) - (this.y);
    }
}