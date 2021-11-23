public static java.lang.String slurp(java.lang.String fileName, java.lang.String charsetName) throws java.io.FileNotFoundException {
    java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(new java.io.File(fileName)), charsetName);
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    while (scanner.hasNextLine()) {
        java.lang.String line = scanner.nextLine();
        sb.append(line).append("\n");
    } 
    scanner.close();
    return sb.toString();
}