public static java.lang.String readNextLine(java.util.Scanner scan) {
    java.lang.String line = scan.nextLine();
    line = line.substring(0, ((line.length()) - 1));
    return line;
}