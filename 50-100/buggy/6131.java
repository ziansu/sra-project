private void save(java.lang.String inputText) {
    if (!(android.text.TextUtils.isEmpty(inputText))) {
        java.io.FileOutputStream out = null;
        java.io.BufferedWriter writer = null;
        try {
            out = openFileOutput("data", Context.MODE_PRIVATE);
            writer = new java.io.BufferedWriter(new java.io.OutputStreamWriter(out));
            writer.write(inputText);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            com.example.dysaniazzz.utils.StreamUtils.endStream(writer);
        }
    }
}