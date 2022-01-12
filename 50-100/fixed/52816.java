public void parse(List[] newList, java.io.File file) throws java.io.FileNotFoundException {
    java.lang.String line;
    scan = new java.util.Scanner(file);
    scan.useDelimiter("[^\\p{Alpha}-|\']+");
    while (scan.hasNext()) {
        line = scan.next();
        addWord(newList, line);
    } 
    scan.close();
}