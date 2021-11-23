@java.lang.Override
public void onBackPressed() {
    com.sothree.slidinguppanel.SlidingUpPanelLayout slidingPanelLayout = ((com.sothree.slidinguppanel.SlidingUpPanelLayout) (findViewById(R.id.sliding_panel_layout)));
    if ((slidingPanelLayout != null) && (slidingPanelLayout.isPanelExpanded())) {
        slidingPanelLayout.collapsePanel();
    }else {
        super.onBackPressed();
    }
}