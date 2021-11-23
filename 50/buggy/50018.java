private void testViews(org.eclipse.tracecompass.tmf.ui.editors.TmfEventsEditor editor) {
    testHistogramView(getViewPart("Histogram"), editor);
    testPropertyView(getViewPart("Properties"));
    testStatisticsView(getViewPart("Statistics"));
}