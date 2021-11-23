private static java.lang.String putGroupAndSVGTag(java.lang.String shape) {
    return ((("<svg>\n" + " <g>\n") + shape) + "</g>\n") + "</svg>\n";
}