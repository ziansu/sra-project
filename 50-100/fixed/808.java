@java.lang.Override
public org.broad.igv.feature.tribble.BasicFeature decode(java.lang.String nextLine) {
    java.lang.String trimLine = nextLine.trim();
    if ((trimLine.length()) == 0) {
        return null;
    }
    if (((nextLine.startsWith("#")) || (nextLine.startsWith("track"))) || (nextLine.startsWith("browser"))) {
        return null;
    }
    tokens = Globals.whitespacePattern.split(trimLine);
    return decode(tokens);
}