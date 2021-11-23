public void updateTemplatesPanel() {
    java.lang.System.out.println("update templates panel called!");
    if ((templatesMap.keySet().size()) > (manager.getTemplateMap().size())) {
        java.lang.System.out.println("remove a template!");
        updateTemplateButtonsRemove();
    }else
        if ((templatesMap.keySet().size()) < (manager.getTemplateMap().size())) {
            java.lang.System.out.println("add a template!");
            updateTemplateButtonsAdd();
        }
    
    templatesBox.repaint();
    this.repaint();
}