public static void writeToVulnerableSink(java.lang.String str) throws java.io.FileNotFoundException {
    java.io.FileOutputStream fos = new java.io.FileOutputStream(str);
    java.io.PrintWriter writer = new java.io.PrintWriter(fos);
    writer.append(str);
}