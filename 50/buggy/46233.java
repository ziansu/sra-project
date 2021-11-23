public java.util.List<java.nio.file.Path> readFilesFromDirectory(java.lang.String dir) {
    java.lang.System.out.println(("Reading\t" + dir));
    java.util.List<java.nio.file.Path> result = new java.util.ArrayList<java.nio.file.Path>();
    listFiles(dir, result);
    return result;
}