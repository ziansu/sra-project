protected void addChildren(int index, org.jsoup.nodes.Node... children) {
    org.jsoup.helper.Validate.noNullElements(children);
    final java.util.List<org.jsoup.nodes.Node> nodes = ensureChildNodes();
    for (org.jsoup.nodes.Node child : children) {
        reparentChild(child);
    }
    nodes.addAll(index, java.util.Arrays.asList(children));
    reindexChildren(index);
}