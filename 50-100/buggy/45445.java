public void actionPerformed(java.awt.event.ActionEvent e) {
    if (!((table.getSelectedRow()) == (-1))) {
        ru.mrekin.sc.launcher.core.PluginManager.getInstance().install(plugins.get(table.getSelectedRow()), ((java.lang.String) (table.getValueAt(table.getSelectedRow(), 2))));
        ru.mrekin.sc.launcher.core.PluginManager.getInstance().loadInstalledPlugins();
        launch();
    }
}