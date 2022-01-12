public static java.lang.String readFile(java.lang.String filepath, int numberOfLines) throws java.io.FileNotFoundException {
    java.lang.StringBuilder stringBuffer = new java.lang.StringBuilder();
    int i = 0;
    java.io.File file = new java.io.File(filepath);
    java.util.Scanner fileStream = new java.util.Scanner(file);
    while ((fileStream.hasNext()) && (i < numberOfLines)) {
        stringBuffer.append(fileStream.nextLine()).append("<br/>");
        i++;
    } 
    fileStream.close();
    return stringBuffer.toString();
}