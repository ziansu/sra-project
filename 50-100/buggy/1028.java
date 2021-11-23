public int getId(java.lang.String name) {
    for (int i = 0; i < (map.capacity()); i++) {
        final C component = map.get(i);
        if (component == null) {
            continue;
        }
        return component.index();
    }
    throw new com.inari.firefly.FFInitException((("No Component with name: " + name) + " found"));
}