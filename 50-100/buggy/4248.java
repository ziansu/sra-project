private void initSlidingPanel() {
    this.slidingUpPanelLayout = ((com.sothree.slidinguppanel.SlidingUpPanelLayout) (findViewById(R.id.sliding_layout)));
    this.slidingUpPanelLayout.setPanelHeight(0);
    this.slidingUpPanelLayout.setShadowHeight(0);
    this.slidingUpPanelLayout.setClipPanel(true);
    this.slidingUpPanelLayout.setAnchorPoint(1000.0F);
    this.slidingUpPanelLayout.setParalaxOffset(100);
    this.titleSlidingLayout = ((android.widget.TextView) (findViewById(R.id.titleSlidingLayout)));
}