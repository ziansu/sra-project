@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
    boolean adjust = evt.getValueIsAdjusting();
    if (!adjust) {
        int[] selections = pluginList.getSelectedIndices();
        for (int i = 0, n = selections.length; i < n; i++) {
            if ((pluginList.getSelectedValue()) == (plugin.getName())) {
                removePluginExecution();
                executePlugin(plugin);
            }
        }
    }
}