@java.lang.Override
@javax.annotation.Nonnull
protected java.lang.String doFormat(@javax.annotation.Nonnull
java.awt.Component c) {
    javax.swing.JTabbedPane tabbedPane = ((javax.swing.JTabbedPane) (c));
    java.lang.String format = "%s[name=%s, selectedTabIndex=%d, selectedTabTitle=%s, tabCount=%d, tabTitles=%s, enabled=%b, visible=%s, showing=%s";
    return java.lang.String.format(format, tabbedPane.getClass().getName(), tabbedPane.getName(), tabbedPane.getSelectedIndex(), selectedTab(tabbedPane), tabbedPane.getTabCount(), org.fest.util.Arrays.format(tabTitles(tabbedPane)), tabbedPane.isEnabled(), tabbedPane.isVisible(), tabbedPane.isShowing());
}