@java.lang.Override
public void setPanelHeightPixels(int heightInPixels) {
    if ((mSlidingPanel) != null) {
        if (((mSlidingPanel.getPanelState()) == (SlidingUpPanelLayout.PanelState.DRAGGING)) || ((mSlidingPanel.getPanelState()) == (SlidingUpPanelLayout.PanelState.HIDDEN))) {
            return ;
        }
        if ((mSlidingPanel.getPanelHeight()) != heightInPixels) {
            mSlidingPanel.setPanelHeight(heightInPixels);
            mArrivalsListHeaderView.getLayoutParams().height = heightInPixels;
            mArrivalsListHeaderSubView.getLayoutParams().height = heightInPixels;
        }
        moveFabsLocation();
    }
}