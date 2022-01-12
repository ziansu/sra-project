protected void addChildren(int index, org.jsoup.nodes.Node... children) {
    org.jsoup.helper.Validate.noNullElements(children);
    for (int i = (children.length) - 1; i >= 0; i--) {
        org.jsoup.nodes.Node in = children[i];
        reparentChild(in);
        childNodes.add(index, in);
    }
    reindexChildren(index);
}