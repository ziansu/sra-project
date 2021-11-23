private static void writeFile(java.lang.String in, java.lang.String name) throws java.io.IOException {
    java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(name));
    pw.close();
}