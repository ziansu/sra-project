private static java.lang.String LoadData(android.content.Context context, int patternId, java.lang.String prefix) {
    java.io.File file = new java.io.File(context.getFilesDir(), (prefix + (java.lang.String.format("%8x", patternId))));
    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(file))) {
        return reader.readLine();
    } catch (java.io.IOException e) {
    }
    return "";
}