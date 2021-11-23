public void setJson() throws java.lang.Exception {
    try {
        java.lang.String contentType = ((java.lang.String) (headers.get("Content-Type")));
        if (contentType.contains("application/json")) {
            if (contentData.startsWith("{")) {
                jsonData = new org.json.JSONObject(contentData);
            }
        }
    } catch (java.lang.Exception e) {
        java.lang.System.err.println("Error on Setting JSON: ");
        e.printStackTrace();
    }
    this.hasJson = true;
    synchronized(jsonLock) {
        jsonLock.notifyAll();
    }
}