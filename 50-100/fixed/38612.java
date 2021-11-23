private void open() {
    f_logFile = new java.io.File(((str_baseDirectory) + (str_fileName)));
    try {
        f_logFile.createNewFile();
    } catch (java.io.IOException excep_create) {
        excep_create.printStackTrace(java.lang.System.err);
    }
    try {
        w_logWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(f_logFile, true)));
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace(java.lang.System.err);
    }
}