private void generateMenus(java.util.List<com.progressoft.jip.ui.xml.element.MenuXml> meuns) {
    for (com.progressoft.jip.ui.xml.element.MenuXml menuXml : meuns) {
        com.progressoft.jip.ui.menu.Menu<T> generatedMenu = generateNewMenu(menuXml.getMenuId(), menuXml.getDescription(), menuXml.getActionId(), menuXml.getSubMenuId());
        loadedMenus.put(menuXml.getMenuId(), generatedMenu);
    }
}