@java.lang.Override
protected sturmtruppen.com.trafficwidget.TrafficQueryResponse doInBackground(java.lang.String[]... params) {
    return GetDistance(params[0][0], params[0][1]);
}