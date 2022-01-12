private void createStationsJSON(java.io.File vFile) {
    java.io.FileOutputStream writer;
    try {
        writer = new java.io.FileOutputStream(vFile, false);
        writer.write(this.body.getBytes());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    android.util.Log.i("FILE WRITER", "Finished writing to stations.json");
}