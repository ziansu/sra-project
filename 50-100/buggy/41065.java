public boolean printToFile2(java.lang.String filePath) {
    komposten.utilities.tools.FileOperations ops = new komposten.utilities.tools.FileOperations();
    java.io.File file = new java.io.File(filePath);
    komposten.utilities.tools.JSONObject data = createJSON();
    komposten.utilities.tools.FileOperations.createFileOrFolder(file, false);
    boolean success = true;
    ops.createWriter(file, false);
    ops.closeWriter();
    ops.createWriter(file, true);
    success = ops.printData(data.toMultiLineString(), false);
    ops.closeWriter();
    return success;
}