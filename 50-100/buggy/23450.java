public static java.lang.String readInput(java.io.InputStream is, boolean readAll) {
    java.util.Scanner sc = new java.util.Scanner(is);
    java.lang.String line = "";
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    try {
        do {
            sb.append(line);
            line = sc.nextLine();
        } while (readAll || ((line.length()) > 0) );
    } catch (java.util.NoSuchElementException e) {
    }
    sc.close();
    return sb.toString();
}