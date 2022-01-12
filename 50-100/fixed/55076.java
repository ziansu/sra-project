@java.lang.Override
public void run() {
    com.nhaarman.supertooltips.ToolTipView hint = toolTipOverlay.showToolTipForView(toolTip, view);
    hint.setPadding(0, 44, 0, 0);
    hint.setOnToolTipViewClickedListener(new com.nhaarman.supertooltips.ToolTipView.OnToolTipViewClickedListener() {
        @java.lang.Override
        public void onToolTipViewClicked(com.nhaarman.supertooltips.ToolTipView toolTipView) {
            com.nextgis.metroaccess.ui.activity.StationImageActivity.hideHint(getActivity(), ((com.nextgis.metroaccess.ui.activity.SelectStationActivity) (getActivity())).getHintScreenName());
        }
    });
}