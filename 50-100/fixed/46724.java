public java.util.List<java.lang.String> getPath() {
    if ((path.get(((path.size()) - 1))) == null) {
        return path.subList(0, ((path.size()) - 1));
    }
    return path;
}