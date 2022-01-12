@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    java.lang.System.out.println(result);
    android.util.Log.d("GooglePlacesReadTask", "onPostExecute Entered");
    java.util.List<java.util.HashMap<java.lang.String, java.lang.String>> nearbyPlacesList = null;
    com.untitledapps.meetasweedt.DataParser dataParser = new com.untitledapps.meetasweedt.DataParser();
    nearbyPlacesList = dataParser.parse(result);
    ShowNearbyPlaces(nearbyPlacesList);
    android.util.Log.d("GooglePlacesReadTask", "onPostExecute Exit");
}