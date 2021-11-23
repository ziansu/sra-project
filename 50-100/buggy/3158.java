public void generate() {
    projectConfiguration = com.org.gnos.core.ProjectConfigutration.getInstance();
    processedBlocks = new java.util.HashSet<java.lang.Integer>();
    int bufferSize = 8 * 1024;
    try {
        output = new java.io.BufferedOutputStream(new java.io.FileOutputStream("output.txt"), bufferSize);
        bytesWritten = 0;
        parseOpexData();
        buildProcessBlockVariables();
        buildWasteBlockVariables();
        output.flush();
        output.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}