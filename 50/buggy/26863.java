protected void onPostExecute(java.lang.Void result) {
    getMapActivity().getMapLayers().getDownloadedRegionsLayer().updateObjects();
    getMapActivity().refreshMap();
}