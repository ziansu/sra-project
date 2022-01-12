public void onClick(org.rstudio.studio.client.common.shell.ClickEvent event) {
    if ((event.getSource()) == (input_)) {
        event.stopPropagation();
        return ;
    }
    if ((!(org.rstudio.core.client.dom.DomUtils.selectionExists())) && (isInputOnscreen())) {
        input_.setFocus(true);
        org.rstudio.core.client.dom.DomUtils.collapseSelection(false);
    }
}