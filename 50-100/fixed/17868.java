public java.lang.String readFile(android.content.Context context) throws java.io.IOException {
    java.lang.String fileData = "";
    java.lang.String fileLine;
    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(context.openFileInput(this.getFileName())));
    fileLine = bufferedReader.readLine();
    while (fileLine != null) {
        fileData += fileLine;
        fileLine = bufferedReader.readLine();
    } 
    return fileData;
}