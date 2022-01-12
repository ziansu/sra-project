public void setChart(org.meteoinfo.chart.Chart value) {
    chart = value;
    if ((this.chart) != null)
        chart.setParent(this);
    
}