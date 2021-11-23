public static void searchFiles(java.io.File workdir, java.lang.String fileName, java.util.List<java.io.File> resultFileList) {
    for (java.io.File file : workdir.listFiles()) {
        if (file.isDirectory()) {
            org.wso2.carbon.appfactory.utilities.file.FileUtilities.searchFiles(file, fileName, resultFileList);
        }else {
            if (fileName.equals(file.getName())) {
                resultFileList.add(file);
            }
        }
    }
}