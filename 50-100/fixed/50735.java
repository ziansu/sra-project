private java.util.Set<javafx.scene.Node> getListCells(javafx.scene.control.ListView<?> listView) {
    java.util.Set<javafx.scene.Node> l = listView.lookupAll("*");
    java.util.Set<javafx.scene.Node> r = new java.util.HashSet<>();
    for (javafx.scene.Node node : l) {
        if ((node instanceof javafx.scene.control.ListCell<?>) && (listView.equals(((javafx.scene.control.ListCell<?>) (node)).getListView()))) {
            r.add(node);
        }
    }
    return r;
}