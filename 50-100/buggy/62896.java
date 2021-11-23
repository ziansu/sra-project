public java.io.File GenerateHTML() {
    java.io.FileWriter fw = null;
    java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory().getAbsolutePath(), "htmlCode.html");
    try {
        fw = new java.io.FileWriter(file);
        java.lang.String htmlResult = assembleHTML();
        fw.append(htmlResult);
        fw.flush();
        fw.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return file;
}