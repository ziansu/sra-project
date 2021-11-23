public java.util.List<model.Item> Search(java.lang.String name) throws java.lang.Exception {
    java.util.List<model.Item> searched = new java.util.ArrayList<>();
    for (model.Item i : itemlist) {
        if ((i.getName()) == name) {
            searched.add(i);
        }
    }
    return searched;
}