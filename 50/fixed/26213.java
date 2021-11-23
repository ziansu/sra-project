@java.lang.Override
public boolean matches(org.jsoup.select.Element root, org.jsoup.select.Element element) {
    return element.attr("selected").equals("true");
}