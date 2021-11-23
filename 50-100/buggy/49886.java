public void actionPerformed(java.awt.event.ActionEvent menuItemEvent) {
    java.lang.System.out.println(menuItemEvent.getActionCommand());
    org.cytoscape.work.TaskIterator iterator = null;
    if (menuItemEvent.getActionCommand().equals(edu.ucsf.rbvi.boundaryLayout.internal.ui.TemplateThumbnailPanel.DELETE_TEMPLATE))
        iterator = new org.cytoscape.work.TaskIterator(new edu.ucsf.rbvi.boundaryLayout.internal.tasks.TemplateDeleteTask(manager, this, templateLabel.getText()));
    else {
        iterator = new org.cytoscape.work.TaskIterator(new edu.ucsf.rbvi.boundaryLayout.internal.tasks.TemplateLabelChangeTask(manager, this, templateLabel));
    }
    if (iterator != null)
        taskManager.execute(iterator);
    
    updateTemplatesPanel();
}