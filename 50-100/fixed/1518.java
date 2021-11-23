private static java.util.List<java.lang.String> getFileLines(java.io.File file) {
    java.util.List<java.lang.String> lines = new java.util.ArrayList<>();
    try {
        java.util.Scanner scanner = new java.util.Scanner(file);
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        } 
        scanner.close();
    } catch (java.io.FileNotFoundException e) {
    }
    return lines;
}