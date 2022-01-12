@no.barentswatch.fiskinfo.JavascriptInterface
public org.json.JSONObject getGeoJson() {
    org.json.JSONObject mordi = null;
    try {
        org.json.JSONObject fnName = no.barentswatch.fiskinfo.MapActivity.getStringFromFile(getAssets().open("redskapsInfoJSON.json"));
        mordi = fnName;
    } catch (java.io.IOException e) {
        java.lang.System.out.println("I FAILED");
        e.printStackTrace();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("I FAILED");
        e.printStackTrace();
    }
    return mordi;
}