@java.lang.Override
public javax.swing.JMenuItem getMenuPresenter() {
    javax.swing.JMenuItem menuItem = new javax.swing.JMenuItem(getName(), getIcon());
    menuItem.addActionListener(this);
    return menuItem;
}