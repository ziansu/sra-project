public void setxAxis(org.jfree.chart.axis.ValueAxis xAxis) {
    this.xAxis = xAxis;
    if ((plot) != null) {
        plot.setDomainAxis(xAxis);
    }
}