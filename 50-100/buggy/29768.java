public static java.lang.String removePuncationAndCapitals(Line l) {
    java.lang.String s = "";
    for (Word word : l.words) {
        s = (s + word) + " ";
    }
    java.lang.String s = s.replaceAll("\"", "\\\\\"");
    return s;
}