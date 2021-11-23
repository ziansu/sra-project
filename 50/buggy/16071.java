private void measureChild(com.tonicartos.superslim.LayoutState.View child, com.tonicartos.superslim.SectionData2 sd) {
    if (child.wasCached) {
        return ;
    }
    mLayoutManager.measureChildWithMargins(child.view, sd.getTotalMarginWidth(), 0);
}