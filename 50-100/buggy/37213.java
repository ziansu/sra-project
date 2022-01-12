public boolean isSame(org.jsoup.nodes.Node o) {
    if ((this) == o)
        return true;
    
    return (hasSameValue(o)) && ((((parentNode) == null) && ((o.parentNode) == null)) || (parentNode.isSame(o.parentNode)));
}