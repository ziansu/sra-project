static boolean writeToFile(java.lang.String input, java.lang.String fileName) {
    java.util.Scanner reader = new java.util.Scanner(java.lang.System.in);
    java.io.PrintWriter writer;
    try {
        writer = new java.io.PrintWriter(fileName, "UTF-8");
    } catch (java.io.IOException q) {
        q.printStackTrace();
        return false;
    }
    writer.println(reader.nextLine());
    return true;
}