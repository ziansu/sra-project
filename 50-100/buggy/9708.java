protected static java.lang.String parseVersion(java.lang.String requestLine) {
    java.util.Scanner scanner;
    java.util.ArrayList<java.lang.String> words = new java.util.ArrayList<java.lang.String>();
    scanner = new java.util.Scanner(requestLine);
    while (scanner.hasNext()) {
        words.add(scanner.next());
    } 
    scanner.close();
    if ((words.size()) == 3) {
        return words.get(2);
    }
    return "HTTP/1.1";
}