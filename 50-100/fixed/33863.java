@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    if (bitmap == null) {
        android.util.Log.e(com.google.maps.android.kml.KmlRenderer.LOG_TAG, ("Image at this URL could not be found " + (mIconUrl)));
    }else {
        mImagesCache.put(mIconUrl, bitmap);
        if (mLayerVisible) {
            addIconToMarkers(mIconUrl, mPlacemarks);
            addContainerGroupIconsToMarkers(mIconUrl, mContainers);
        }
    }
}