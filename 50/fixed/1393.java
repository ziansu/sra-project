private static java.lang.String safeName(final java.lang.String name, int id) {
    return (name == null) || (name.trim().isEmpty()) ? "Player " + id : name.replaceAll("[^A-zA-Z0-9 ]", "");
}