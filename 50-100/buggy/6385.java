protected java.lang.String searchLineInFile(java.lang.String prefix) {
    java.lang.String r = "";
    try {
        scanner = new java.util.Scanner(file);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
    boolean found = false;
    while (found == false) {
        if (scanner.hasNextLine()) {
            java.lang.String s = scanner.nextLine();
            if (s.startsWith(prefix)) {
                r = s;
                found = true;
            }
        }
    } 
    return r.replaceAll(separator, "");
}