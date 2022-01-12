public void run() {
    double[] d = com.as.atlas.googlemapfollowwe.Utils.getLatLngFromGoogleMapAPI(suggestedPlace);
    if (d == null)
        return ;
    
    android.util.Log.d(com.as.atlas.googlemapfollowwe.MapPlaceSelectionListener.TAG, ((("SearchLatLngThread d:" + (d[0])) + "/") + (d[1])));
    android.os.Message msg = this.obtainMessage(com.as.atlas.googlemapfollowwe.MapPlaceSelectionListener.EVENT_ON_SUGGEST_PLACE_DONE);
    android.os.Bundle data = new android.os.Bundle();
    data.putDoubleArray(com.as.atlas.googlemapfollowwe.MapPlaceSelectionListener.KEY_LATLNG, d);
    msg.setData(data);
    sendMessage(msg);
}