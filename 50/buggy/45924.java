@java.lang.Override
public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
    return (element.hasAttr(key)) && (pattern.matcher(element.attr(key)).find());
}