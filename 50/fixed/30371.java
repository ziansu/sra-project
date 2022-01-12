void toggleShowActiveOnly_actionPerformed(java.awt.event.ActionEvent event) {
    net.sf.memoranda.util.Context.put("SHOW_ACTIVE_TASKS_ONLY", new java.lang.Boolean(ppShowActiveOnlyChB.isSelected()));
    taskTable.tableChanged();
}