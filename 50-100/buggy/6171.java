@java.lang.Override
public void success(com.mapzen.pelias.gson.Result result, retrofit.client.Response response) {
    java.util.List<com.mapzen.pelias.gson.Feature> features = result.getFeatures();
    result.getType();
    if ((features == null) && ((features.size()) < 1)) {
        android.widget.Toast.makeText(this, "No lat, lng found for address", Toast.LENGTH_LONG).show();
    }else {
        com.mapzen.pelias.gson.Feature f = features.get(0);
        double lat = f.geometry.coordinates.get(0);
        double lng = f.geometry.coordinates.get(1);
    }
}