public void highlightValues(com.github.mikephil.charting.highlight.Highlight[] highs) {
    mIndicesToHighlight = highs;
    if (((highs == null) || ((highs.length) <= 0)) || ((highs[0]) == null)) {
        mChartTouchListener.setLastHighlighted(null);
    }else {
        mChartTouchListener.setLastHighlighted(highs[0]);
    }
    com.github.mikephil.charting.charts.Chart.invalidate();
}