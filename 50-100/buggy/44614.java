private void loadConfiguration() {
    try {
        java.io.InputStream stream = unmannedairlines.dronepan.DronePanApplication.getContext().getResources().openRawResource(R.raw.models);
        modelOverrides = ((com.dd.plist.NSDictionary) (com.dd.plist.PropertyListParser.parse(stream)));
        defaults = ((com.dd.plist.NSDictionary) (modelOverrides.get("defaults")));
    } catch (java.lang.Exception ex) {
    }
}