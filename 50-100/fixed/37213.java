public boolean isSame(org.jsoup.nodes.Node o) {
    return ((this) == o) || ((hasSameValue(o)) && ((((parentNode) == null) && ((o.parentNode) == null)) || (((parentNode) != null) && (parentNode.isSame(o.parentNode)))));
}