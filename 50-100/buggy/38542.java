public java.lang.String loadJSONFromAsset() {
    java.lang.String json = null;
    try {
        java.io.InputStream is = getActivity().getAssets().open("vainglory_database.json");
        int size = is.available();
        byte[] buffer = new byte[size];
        is.read(buffer);
        is.close();
        json = new java.lang.String(buffer, "UTF-8");
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
        return null;
    }
    return json;
}