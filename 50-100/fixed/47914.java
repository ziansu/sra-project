private nu.xom.Element get_nearest_of(java.util.List<java.lang.String> tags) {
    for (int i = 0; i < (size()); i++) {
        if (tags.contains(get(i).getLocalName()))
            return get(i);
        
    }
    return null;
}