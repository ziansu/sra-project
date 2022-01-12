protected static void setupProgressDialog(org.redcross.openmapkit.MapActivity mapActivity) {
    if (((org.redcross.openmapkit.OSMMapBuilder.progressDialog) != null) && (org.redcross.openmapkit.OSMMapBuilder.progressDialog.isShowing()))
        org.redcross.openmapkit.OSMMapBuilder.progressDialog.dismiss();
    
    org.redcross.openmapkit.OSMMapBuilder.progressDialog = new android.app.ProgressDialog(mapActivity);
    org.redcross.openmapkit.OSMMapBuilder.progressDialog.setTitle("Loading OSM Data");
    org.redcross.openmapkit.OSMMapBuilder.progressDialog.setMessage("");
    org.redcross.openmapkit.OSMMapBuilder.progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
    org.redcross.openmapkit.OSMMapBuilder.progressDialog.setProgress(0);
    org.redcross.openmapkit.OSMMapBuilder.progressDialog.setMax(100);
    org.redcross.openmapkit.OSMMapBuilder.progressDialog.show();
}