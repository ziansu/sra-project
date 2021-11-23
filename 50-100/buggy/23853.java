private java.lang.String getStringFromAsset(java.lang.String assetName) {
    java.lang.String jsonString = null;
    try {
        java.io.InputStream inputStream = this.context.getAssets().open(assetName);
        int size = inputStream.available();
        byte[] buffer = new byte[size];
        inputStream.read(buffer);
        inputStream.close();
        jsonString = new java.lang.String(buffer, "UTF-8");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        return jsonString;
    }
}