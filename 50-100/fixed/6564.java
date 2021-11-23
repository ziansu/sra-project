public static boolean isXml(java.io.File file) throws edu.brandeis.cs.nlp.mae.io.MaeIOException {
    try {
        java.util.Scanner scanner = new java.util.Scanner(new java.io.BufferedReader(new java.io.FileReader(file)));
        while (scanner.hasNext()) {
            java.lang.String nextLine = scanner.nextLine().trim();
            if ((nextLine.length()) > 1) {
                return nextLine.startsWith("<?xml");
            }
        } 
    } catch (java.io.FileNotFoundException e) {
        throw new edu.brandeis.cs.nlp.mae.io.MaeIOException("file not found", e);
    }
    return false;
}