private void saveInFile() {
    try {
        java.io.FileOutputStream fos = openFileOutput(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.FILENAME, Context.MODE_PRIVATE);
        java.io.BufferedWriter out = new java.io.BufferedWriter(new java.io.OutputStreamWriter(fos));
        com.google.gson.Gson gson = new com.google.gson.Gson();
        gson.toJson(tweets, out);
        out.flush();
        fos.close();
    } catch (java.io.FileNotFoundException e) {
        throw new java.lang.RuntimeException();
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException();
    }
}