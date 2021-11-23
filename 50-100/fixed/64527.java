public boolean accept(java.io.File pathname) {
    return ((prefix.length()) <= (pathname.getName().length())) && (pathname.getName().substring(0, prefix.length()).equals(prefix));
}