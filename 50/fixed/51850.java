public boolean contains(java.lang.String name) {
    if (data.containsKey(name)) {
        return true;
    }
    if ((transitive) && ((previous) != null)) {
        return previous.contains(name);
    }
    return false;
}