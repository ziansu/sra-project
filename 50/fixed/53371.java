protected void onPostExecute(java.lang.Void aVoid) {
    android.util.Log.i("System.out", ("Size is " + (ambiesoft.start.fragment.GoogleMapFragment.artworks.size())));
    drawArtworksMarker();
}