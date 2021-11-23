private static java.lang.String _extractText(org.jsoup.nodes.Node node) {
    java.lang.String text = ((node.getClass()) == (org.jsoup.nodes.TextNode.class)) ? ((org.jsoup.nodes.TextNode) (node)).text() : ((org.jsoup.nodes.Element) (node)).text();
    text = text.replace(((char) (160)), ' ').trim();
    return text.isEmpty() ? null : text;
}