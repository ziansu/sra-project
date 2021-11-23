private static java.lang.String safeName(final java.lang.String name, int id) {
    return name == null ? "Player " + id : name.replaceAll("[^A-zA-Z0-9 ]", "");
}