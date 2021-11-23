public java.util.List<java.lang.String> getFileNames() {
    java.io.File folder = new java.io.File("/home/patrick/text_annotation_tools/brat-v1.3_Crunchy_Frog/data/testdata");
    java.io.File[] files = folder.listFiles();
    java.util.List<java.lang.String> fileNames = new java.util.ArrayList<>();
    for (java.io.File file : files) {
        fileNames.add(file.getName());
    }
    return fileNames;
}