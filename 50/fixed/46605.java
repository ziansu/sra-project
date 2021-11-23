private static boolean matchesSeverity(final java.lang.Integer markerSeverity, final java.lang.Object severity) {
    return (severity instanceof java.lang.Integer) && (((java.lang.Integer) (severity)).equals(markerSeverity));
}