@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap result) {
    if ((mMap) != null)
        mMap.clear();
    
    drawOwnLocation();
    drawPolylines();
    drawStations();
}