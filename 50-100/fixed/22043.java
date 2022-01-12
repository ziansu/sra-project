public static java.lang.String firstPass(java.lang.String s) {
    java.lang.String out = "";
    java.util.Scanner reader = new java.util.Scanner(s);
    int lineNumber = 0;
    while (reader.hasNextLine()) {
        java.lang.String next = reader.nextLine();
        if (!(Program.removeLine(next, lineNumber))) {
            out += next + "\n";
            lineNumber++;
        }
    } 
    reader.close();
    return out;
}