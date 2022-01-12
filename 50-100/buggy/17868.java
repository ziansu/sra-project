public java.lang.String readFile(android.content.Context context) {
    java.lang.String fileData = "";
    try {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(context.openFileInput(this.getFileName())));
        java.lang.String fileLine = bufferedReader.readLine();
        while (fileLine != null)
            fileData += fileLine;
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return fileData;
}