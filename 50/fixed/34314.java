@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap result) {
    drawOwnLocation();
    drawPolylines();
    drawStations();
}