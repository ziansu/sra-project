void drawRootLayer() {
    org.mozilla.gecko.gfx.Layer rootLayer = mView.getController().getRoot();
    if (rootLayer == null) {
        return ;
    }
    rootLayer.draw(mPageContext);
}