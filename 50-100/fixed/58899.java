public void run() {
    final double[] mapPoint = mapController.toMapPoint(((int) (x)), ((int) (y)));
    if ((null != mapPoint) && (null != (getSpatialReference()))) {
        chemLightController.sendChemLight(mapPoint[0], mapPoint[1], getSpatialReference().getID(), color);
    }else {
        android.util.Log.i(com.esri.squadleader.view.SquadLeaderActivity.TAG, "Couldn't convert chem light to map coordinates");
    }
}