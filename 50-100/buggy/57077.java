private java.io.File getFile(int posQuestion, java.lang.String fileName) {
    fileName = (ServeClient.root) + fileName;
    java.lang.System.out.println(fileName);
    if (posQuestion == (-1)) {
        return new java.io.File(fileName.substring(1, fileName.length()));
    }else {
        return new java.io.File(fileName.substring(1, ((ServeClient.root.length()) + posQuestion)));
    }
}