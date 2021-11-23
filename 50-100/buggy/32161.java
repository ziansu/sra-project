public static void writeToLatexFile(java.lang.String latex, java.lang.String outputFileName) {
    try {
        java.io.File outputFile = new java.io.File(outputFileName);
        java.io.FileWriter writer = new java.io.FileWriter(outputFile);
        java.io.BufferedWriter bw = new java.io.BufferedWriter(writer);
        bw.write(latex);
        bw.close();
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
        java.lang.System.exit(2);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        java.lang.System.exit(2);
    }
}