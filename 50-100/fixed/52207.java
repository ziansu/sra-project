public static void stringToFile(java.util.ArrayList<java.lang.String> decipheredText, java.lang.String filePath) {
    try {
        java.io.PrintWriter writer = new java.io.PrintWriter(filePath, "UTF-8");
        for (java.lang.String decipheredTextBlock : decipheredText) {
            writer.print(decipheredTextBlock);
        }
        writer.close();
    } catch (java.io.FileNotFoundException | java.io.UnsupportedEncodingException e) {
        java.lang.System.out.println(("Error saving file: " + (e.getMessage())));
    }
    java.lang.System.out.println("File saved.");
}