public int getId(java.lang.String name) {
    if (name == null) {
        return -1;
    }
    for (int i = 0; i < (map.capacity()); i++) {
        final C component = map.get(i);
        if (component == null) {
            continue;
        }
        if (name.equals(component.getName())) {
            return component.index();
        }
    }
    return -1;
}