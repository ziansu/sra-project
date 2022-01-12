private void initSlidingPanel() {
    this.slidingUpPanelLayout = ((com.sothree.slidinguppanel.SlidingUpPanelLayout) (findViewById(R.id.sliding_layout)));
    this.slidingUpPanelLayout.setPanelHeight(0);
    this.slidingUpPanelLayout.setShadowHeight(0);
    this.slidingUpPanelLayout.setClipPanel(false);
    this.slidingUpPanelLayout.setAnchorPoint(0.0F);
    this.slidingUpPanelLayout.setParalaxOffset(0);
    this.titleSlidingLayout = ((android.widget.TextView) (findViewById(R.id.titleSlidingLayout)));
}