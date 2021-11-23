protected int getLabelHeight() {
    if (((labelHeight) == (-1)) || ((labelHeight) == 0)) {
        int result = 0;
        if ((chartView.data.size()) > 0) {
            for (com.db.chart.model.ChartEntry e : chartView.data.get(0).getEntries()) {
                result = chartView.style.getTextHeightBounds(e.getLabel());
                if (result != 0)
                    break;
                
            }
        }
        labelHeight = result;
    }
    return labelHeight;
}