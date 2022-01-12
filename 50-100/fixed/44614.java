private void loadConfiguration() {
    try {
        android.content.Context c = unmannedairlines.dronepan.DronePanApplication.getContext();
        java.io.InputStream stream = c.getResources().openRawResource(R.raw.models);
        modelOverrides = ((com.dd.plist.NSDictionary) (com.dd.plist.PropertyListParser.parse(stream)));
        defaults = ((com.dd.plist.NSDictionary) (modelOverrides.get("defaults")));
    } catch (java.lang.Exception ex) {
    }
}