protected void setLastHighlighted(com.github.mikephil.charting.highlight.Highlight[] highs) {
    if (((highs == null) || ((highs.length) <= 0)) || ((highs[0]) == null)) {
        mChartTouchListener.setLastHighlighted(null);
    }else {
        mChartTouchListener.setLastHighlighted(highs[0]);
    }
}