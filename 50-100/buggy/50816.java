@java.lang.Override
public javax.swing.JMenuItem[] getMenuItemsAtLocation(org.jmeterplugins.repository.MENU_LOCATION location) {
    if (location == (MENU_LOCATION.OPTIONS)) {
        try {
            org.jmeterplugins.repository.PluginManagerCMDInstaller.main(new java.lang.String[0]);
        } catch (java.lang.Throwable e) {
            org.jmeterplugins.repository.PluginManagerMenuCreator.log.warn("Was unable to install pmgr cmdline tool");
        }
        try {
            return new javax.swing.JMenuItem[]{ new org.jmeterplugins.repository.PluginManagerMenuItem() };
        } catch (java.lang.Throwable e) {
            org.jmeterplugins.repository.PluginManagerMenuCreator.log.error("Failed to load Plugins Manager", e);
            return new javax.swing.JMenuItem[0];
        }
    }else {
        return new javax.swing.JMenuItem[0];
    }
}