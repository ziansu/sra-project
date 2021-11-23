public void updateTemplatesPanel() {
    if ((templatesMap.keySet().size()) > (manager.getTemplateMap().size()))
        updateTemplateButtonsRemove();
    else
        if ((templatesMap.keySet().size()) < (manager.getTemplateMap().size()))
            updateTemplateButtonsAdd();
        
    
    templatesBox.repaint();
    this.repaint();
}