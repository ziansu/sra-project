public boolean accept(java.io.File pathname) {
    return ((prefix.length()) <= (pathname.length())) && (pathname.getName().substring(0, prefix.length()).equals(prefix));
}