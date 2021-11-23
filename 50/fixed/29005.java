public void removeItem(java.lang.String name) {
    if (name != null) {
        name = name.toLowerCase().trim();
        this.hash.remove(name);
    }
}