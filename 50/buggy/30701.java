@java.lang.Override
public javax.swing.plaf.MenuItemUI getItemUI(final javax.swing.JMenuItem jMenuItem, final dorkbox.systemTray.Entry entry) {
    return new dorkbox.util.swing.DefaultMenuItemUI(jMenuItem) {
        @java.lang.Override
        public void installUI(final javax.swing.JComponent c) {
            super.installUI(c);
        }
    };
}