public void actionPerformed(java.awt.event.ActionEvent templateChosen) {
    java.lang.System.out.println(((templateChosen.getActionCommand()) + " is the template name!"));
    org.cytoscape.view.model.CyNetworkView view = cyApplicationManager.getCurrentNetworkView();
    manager.clearNetworkofTemplates(view);
    boolean isTemplateApplied = manager.useTemplate(templateChosen.getActionCommand(), view);
    if (isTemplateApplied)
        setCurrentTemplateName(templateChosen.getActionCommand());
    
}