private void disableSlidingPanel() {
    com.sothree.slidinguppanel.SlidingUpPanelLayout slidingUpLayout = ((com.sothree.slidinguppanel.SlidingUpPanelLayout) (findViewById(R.id.sliding_layout)));
    slidingUpLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
    slidingUpLayout.setPanelHeight(0);
    isSlidingPanelEnabled = false;
}