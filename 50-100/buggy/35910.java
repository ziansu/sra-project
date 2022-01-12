public void createHtmlElement() {
    net.abstractfactory.plum.view.web.component.ComponentElements componentElements = findAndCloneElement(getComponentHtmlTemplate(true), true);
    htmlOuterElement = componentElements.getOuter();
    htmlInnerElement = componentElements.getInner();
    link = htmlOuterElement.getElementsByTag("a").first();
    link.attr("href", "");
    text = htmlOuterElement.getElementsByClass("menu-text").first();
    text.text(null2Empty(getComponent().getCaption()));
}