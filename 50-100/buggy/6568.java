private void readJsonStream(java.io.InputStream in, com.josephcmontgomery.bookscanner.BookInformation book) throws java.lang.Exception {
    android.util.JsonReader reader = new android.util.JsonReader(new java.io.InputStreamReader(in, "UTF-8"));
    try {
        com.josephcmontgomery.bookscanner.BookJsonInterpreter.processSearchResult(reader, book);
    } finally {
        reader.close();
    }
}