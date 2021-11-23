void setBottomSibling(com.alibaba.weex.plugin.gcanvas.bubble.BubblePosition bottomSibling) {
    this.mBottom = bottomSibling;
    if (null != (this.mBottom)) {
        this.disBottomY = (this.y) - (this.mBottom.y);
    }
}