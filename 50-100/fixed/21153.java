public java.lang.String[] readFile(java.io.File file) throws java.io.FileNotFoundException {
    java.util.ArrayList<java.lang.String> contents = new java.util.ArrayList<java.lang.String>(0);
    java.io.FileReader configRead = new java.io.FileReader(file);
    java.util.Scanner scan = new java.util.Scanner(configRead);
    while (scan.hasNextLine()) {
        contents.add(scan.nextLine());
    } 
    scan.close();
    return contents.toArray(new java.lang.String[contents.size()]);
}