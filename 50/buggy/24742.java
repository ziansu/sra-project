public void deleteEntry(java.lang.String name) {
    if (detail.containsKey(name)) {
        detail.remove(name, detail.get(name));
    }
}