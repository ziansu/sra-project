private void setNextView() {
    se.idainfront.view.BasePage page = new se.idainfront.view.BasePage(new org.apache.wicket.request.mapper.parameter.PageParameters());
    java.util.HashMap<java.lang.String, se.idainfront.resources.ObjectType> objectTypeMap = controller.getObjectTypes(doc);
    page.panel.html = controller.convertToHTML(objectTypeMap, currentMode);
    page.sidePanel.html = controller.createSidebar(objectTypeMap);
    page.selectedXmlFile = selectedXmlFile;
    page.currentMode = currentMode;
    page.doc = doc;
    setResponsePage(page);
    java.lang.String ds;
}