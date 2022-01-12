public static java.lang.String readFile() {
    java.io.FileReader fileReader;
    try {
        fileReader = new java.io.FileReader(main.java.utility.Utility.REMEMBER_ME_FILE);
        java.io.BufferedReader reader = new java.io.BufferedReader(fileReader);
        java.lang.String line = null;
        line = reader.readLine();
        java.lang.System.out.println(line);
        reader.close();
        return line;
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException x) {
        java.lang.System.err.format("IOException: %s%n", x);
    }
    return "";
}