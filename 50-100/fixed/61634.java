protected java.lang.String doInBackground() {
    java.io.File selectedFile = fc.getSelectedFile();
    try {
        java.io.InputStream is = new java.io.FileInputStream(selectedFile);
        if (selectedFile.getName().contains("kmz")) {
            parse = new Parse(is, true);
            parse = null;
        }else {
            parse = new Parse(is, false);
            openFile();
        }
    } catch (java.io.IOException e) {
    }
    hasFile = true;
    return "Done";
}