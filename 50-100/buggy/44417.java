public boolean isIconAvailable() {
    java.lang.String os = java.lang.System.getProperty("os.name").toLowerCase();
    if (os.contains("windows")) {
        return true;
    }
    if (!(java.lang.System.getenv("XDG_CURRENT_DESKTOP").toLowerCase().contains("GNOME"))) {
        return (!("kde".equals(java.lang.System.getenv("XDG_CURRENT_DESKTOP").toLowerCase()))) || (!("5".equals(java.lang.System.getenv("KDE_SESSION_VERSION"))));
    }
    return false;
}