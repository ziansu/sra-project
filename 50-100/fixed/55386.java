private static java.lang.String callScanner(java.lang.String s) {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.printf((((("Cache entry to be invalidated for query:" + "[") + s) + "]") + ":"));
    int i;
    for (i = 1; i <= 2; i++) {
        java.lang.System.out.println("");
    }
    org.basex.web.servlet.impl.Xails.tobeinvalidated = scanner.next();
    return org.basex.web.servlet.impl.Xails.tobeinvalidated;
}