private static void RemoveFromHDFS(java.lang.String path, java.lang.String directoryName) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String command = ((("hadoop fs -rm -r " + path) + "/") + directoryName) + "/";
    java.lang.Runtime.getRuntime().exec(command).waitFor();
}