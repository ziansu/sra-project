public com.lhc.highlight.HighLight addHighLight(android.view.View view, int decorLayoutId, com.lhc.highlight.position.IPositionStrategy posStrategy, com.lhc.highlight.shape.IHighLight highLightShape) {
    checkAnchor();
    if (view == null) {
        return this;
    }
    android.view.View parent = mAnchor;
    com.lhc.highlight.HighLight.ViewInfo viewInfo = new com.lhc.highlight.HighLight.ViewInfo();
    viewInfo.parent = parent;
    viewInfo.decorLayoutId = decorLayoutId;
    viewInfo.highLightView = view;
    viewInfo.posStrategy = posStrategy;
    viewInfo.highLight = (highLightShape == null) ? new com.lhc.highlight.shape.RectLightShape(0, 0) : highLightShape;
    mHighLightViews.add(viewInfo);
    return this;
}