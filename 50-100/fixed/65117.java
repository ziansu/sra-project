@java.lang.Override
public void extract(java.io.File file) throws java.io.IOException {
    counter = 0;
    if ((reader) != null) {
        reader.close();
    }
    if (file.getName().endsWith(".gz")) {
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.util.zip.GZIPInputStream(new java.io.FileInputStream(file))));
    }else {
        reader = new java.io.BufferedReader(new java.io.FileReader(file));
    }
}