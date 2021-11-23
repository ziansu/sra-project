static boolean writeToFile(java.lang.String input, java.lang.String fileName) {
    java.io.PrintWriter writer;
    try {
        writer = new java.io.PrintWriter(fileName, "UTF-8");
    } catch (java.io.IOException q) {
        q.printStackTrace();
        return false;
    }
    writer.println(input);
    return true;
}