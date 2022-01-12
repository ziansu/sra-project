@no.barentswatch.fiskinfo.JavascriptInterface
public org.json.JSONObject getGeoJson() {
    org.json.JSONObject mordi = null;
    try {
        java.lang.System.out.println("DO I FAIL?");
        org.json.JSONObject fnName = mTools.getTools();
        mordi = fnName;
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("I FAILED");
        e.printStackTrace();
    }
    return mordi;
}