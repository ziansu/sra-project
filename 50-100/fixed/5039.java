public java.util.List<model.Item> getResteurantItems(java.lang.String name) throws java.lang.Exception {
    java.util.List<model.Item> rest = new java.util.ArrayList<>();
    for (model.Item i : itemlist) {
        if (i.getResteurant().equals(name)) {
            rest.add(i);
        }
    }
    return rest;
}