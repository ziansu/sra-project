public void setFilename(java.lang.String filename) {
    if (filename != null) {
        if (filename.endsWith(((java.io.File.separator) + "DB")))
            connField.setText(filename.substring(0, ((filename.length()) - 3)));
        else
            connField.setText(filename);
        
    }
}