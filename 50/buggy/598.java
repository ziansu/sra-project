private int isHeader(com.google.gwt.dom.client.Element target) {
    java.lang.String className = target.getParentElement().getAttribute("class");
    return jsniUtil.isHeader(className);
}