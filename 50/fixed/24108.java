public static boolean switchExists(final java.lang.String name) {
    for (com.sb.elsinore.Switch p : com.sb.elsinore.LaunchControl.switchList) {
        if (p.getName().equals(name)) {
            return true;
        }
    }
    return false;
}