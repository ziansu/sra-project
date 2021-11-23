public static java.lang.String getStdIn() {
    java.lang.String fromStdIn = "";
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    while (scanner.hasNextLine()) {
        fromStdIn += scanner.nextLine();
    } 
    return fromStdIn;
}