public static java.lang.String readFile(java.lang.String filepath) throws java.io.FileNotFoundException {
    java.lang.StringBuilder stringBuffer = new java.lang.StringBuilder();
    int i = 0;
    java.io.File file = new java.io.File(filepath);
    java.util.Scanner fileStream = new java.util.Scanner(file);
    while (fileStream.hasNext()) {
        stringBuffer.append(fileStream.nextLine()).append("<br/>");
        i++;
    } 
    fileStream.close();
    return stringBuffer.toString();
}