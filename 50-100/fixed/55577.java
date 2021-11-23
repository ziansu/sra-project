private static void displayUsage(java.lang.String errorMessage) {
    if ((errorMessage != null) && (!(errorMessage.isEmpty()))) {
        java.lang.System.out.println(errorMessage);
    }
    java.lang.System.out.println("usage: search [-x] -f <filename> [-p <text>] <directory>");
    java.lang.System.out.println();
    java.lang.System.out.println("-f <fileName>   Name of the file to search for. If regex compatibility is enabled, then this is the pattern to match against.");
    java.lang.System.out.println("<directory>     Path to the root directory to start the search in.");
    java.lang.System.out.println();
    java.lang.System.out.println("Optional");
    java.lang.System.out.println("-x              Enable regex compatibiliy. Changes the -f and -p options to be regular expressions.");
    java.lang.System.out.println("-p <text>       Match text content. Matching files must contain this text. If regex compatibility is enabled, then this is the pattern to match against.");
}