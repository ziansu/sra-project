@java.lang.Override
public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element, int index, int collectionSize, int depth) {
    return (depth == (this.depth)) && (evaluator.matches(root, element, index, collectionSize, depth));
}