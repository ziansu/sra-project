protected int getLabelHeight() {
    if ((labelHeight) == (-1)) {
        int result = 0;
        for (com.db.chart.model.ChartEntry e : chartView.data.get(0).getEntries()) {
            result = chartView.style.getTextHeightBounds(e.getLabel());
            if (result != 0)
                break;
            
        }
        labelHeight = result;
    }
    return labelHeight;
}