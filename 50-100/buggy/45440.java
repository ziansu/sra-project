public static java.lang.String removeCarets(java.lang.String string) {
    java.lang.String retVal = "";
    java.lang.String[] stringArray = string.split("\\r?\\n");
    TextProcess.TextFilePreProcess.write("Removing carets");
    for (java.lang.String line : stringArray) {
        retVal += (line.replaceAll("> ", "")) + "\n";
    }
    return retVal;
}