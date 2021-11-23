public java.util.Optional<T> get(java.lang.String name) {
    return stream().filter(( item) -> item.getNewName().equalsIgnoreCase(name)).findAny();
}