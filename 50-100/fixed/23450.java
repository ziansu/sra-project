public static java.lang.String readInput(java.util.Scanner sc, boolean readAll) {
    java.lang.String line = "";
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    try {
        do {
            sb.append(line);
            line = sc.nextLine();
        } while (readAll || ((line.length()) > 0) );
    } catch (java.util.NoSuchElementException e) {
    }
    return sb.toString();
}