private org.jfree.chart.JFreeChart allocChartFromType(java.lang.String text) {
    org.jfree.chart.JFreeChart result = null;
    if (text.equals(WidgetPanelChartType.CTYP_Area)) {
        result = allocDefaultAreaChart();
    }else
        if (text.equals(WidgetPanelChartType.CTYP_Pie)) {
            result = allocDefaultPieChart();
        }
    
    return result;
}