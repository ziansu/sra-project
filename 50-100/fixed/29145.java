@java.lang.Override
protected <T extends ru.yandex.qatools.htmlelements.element.HtmlElement> java.util.List<T> decorateHtmlElementList(java.lang.ClassLoader loader, java.lang.reflect.Field field) {
    java.util.List<T> elements = super.decorateHtmlElementList(loader, field);
    if ((!(elements.isEmpty())) && ((elements.get(0)) instanceof ru.yandex.qatools.htmlelements.loader.decorator.WebDriverAware)) {
        for (T element : elements) {
            ((ru.yandex.qatools.htmlelements.loader.decorator.WebDriverAware) (element)).setWebDriver(driver);
        }
    }
    return elements;
}