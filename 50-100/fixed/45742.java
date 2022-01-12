public static boolean randomlyModifyFile(java.lang.String filename) {
    try {
        java.io.File file = new java.io.File(((Model.State.GitVCS.RESOURCES_DIRECTORY) + filename));
        if (!(file.exists())) {
            return false;
        }else {
            java.lang.String fileContext = org.apache.commons.io.FileUtils.readFileToString(file);
            fileContext = fileContext.concat(Model.Tools.RandomFileGenerator.randomText());
            org.apache.commons.io.FileUtils.write(file, fileContext);
        }
    } catch (java.io.IOException ioe) {
        ioe.printStackTrace();
    }
    return true;
}