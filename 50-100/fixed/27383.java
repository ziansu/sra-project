public static java.lang.String getLine(int position, android.content.res.Resources r) throws java.io.IOException {
    java.io.InputStream is = r.getAssets().open("StoresPdf.txt");
    java.io.BufferedReader textReader = new java.io.BufferedReader(new java.io.InputStreamReader(is));
    java.lang.String storeAndUrl;
    for (int i = 1; i < position; i++) {
        textReader.readLine();
    }
    storeAndUrl = textReader.readLine();
    textReader.close();
    is.close();
    return storeAndUrl;
}