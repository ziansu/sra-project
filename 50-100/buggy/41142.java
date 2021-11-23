public com.jjoe64.graphview.series.LineGraphSeries draw() {
    com.jjoe64.graphview.series.DataPoint[] datapoints;
    if ((this.route) != null) {
        datapoints = this.drawRoute();
    }else
        if ((this.routeHistory) != null) {
            datapoints = this.drawRouteHistory();
        }else {
            throw new java.lang.RuntimeException();
        }
    
    return new com.jjoe64.graphview.series.LineGraphSeries(datapoints);
}