public java.lang.String readFromJsonFile(android.content.Context context) {
    java.io.InputStream is = context.getResources().openRawResource(R.raw.places_json);
    java.lang.StringBuffer sbJsonString = new java.lang.StringBuffer();
    int character;
    try {
        while ((character = is.read()) != (-1)) {
            sbJsonString.append(((char) (character)));
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return sbJsonString.toString();
}