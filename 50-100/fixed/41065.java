public void printToFile2(java.lang.String filePath) throws java.io.IOException {
    komposten.utilities.tools.FileOperations ops = new komposten.utilities.tools.FileOperations();
    java.io.File file = new java.io.File(filePath);
    komposten.utilities.tools.JSONObject data = createJSON();
    komposten.utilities.tools.FileOperations.createFileOrFolder(file, false);
    ops.createWriter(file, false);
    ops.closeWriter();
    ops.createWriter(file, true);
    ops.printData(data.toMultiLineString(), false);
    ops.closeWriter();
}