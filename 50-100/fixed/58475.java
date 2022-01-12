public static long parseLong(java.util.Scanner scan, java.lang.String tag) throws kps.parser.ParserException {
    kps.parser.KPSParser.gobble(scan, (("<" + tag) + ">"));
    long data = 0;
    java.lang.String next = scan.next();
    try {
        data = java.lang.Long.parseLong(next);
    } catch (java.lang.NumberFormatException e) {
        throw new kps.parser.ParserException(("ParserException: Expecting an integer, received " + next));
    }
    kps.parser.KPSParser.gobble(scan, (("</" + tag) + ">"));
    return data;
}