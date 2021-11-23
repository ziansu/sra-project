public boolean accept(java.io.File dir, java.lang.String name) {
    name = name.toLowerCase();
    return (!(name.startsWith("delete"))) && (name.endsWith(".jpg"));
}