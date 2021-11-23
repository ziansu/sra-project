@java.lang.Override
public javax.swing.JPopupMenu createPopupMenu() {
    javax.swing.JPopupMenu menu = new javax.swing.JPopupMenu();
    javax.swing.JMenu addMenu = org.apache.jmeter.gui.util.MenuFactory.makeMenus(new java.lang.String[]{ org.apache.jmeter.gui.util.MenuFactory.CONFIG_ELEMENTS , org.apache.jmeter.gui.util.MenuFactory.ASSERTIONS , org.apache.jmeter.gui.util.MenuFactory.TIMERS , org.apache.jmeter.gui.util.MenuFactory.LISTENERS }, org.apache.jmeter.util.JMeterUtils.getResString("add"), ActionNames.ADD);
    menu.add(addMenu);
    org.apache.jmeter.gui.util.MenuFactory.addEditMenu(menu, true);
    org.apache.jmeter.gui.util.MenuFactory.addFileMenu(menu);
    return menu;
}