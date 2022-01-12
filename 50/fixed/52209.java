public static void activateMenuItem(org.eclipse.swt.widgets.Menu menu, java.lang.String name) {
    org.eclipse.swt.widgets.MenuItem item = org.xtuml.bp.test.common.UITestingUtilities.getMenuItemByPath(menu, name);
    if (item != null) {
        org.xtuml.bp.test.common.UITestingUtilities.activateMenuItem(item);
        org.xtuml.bp.test.common.BaseTest.dispatchEvents();
    }
}