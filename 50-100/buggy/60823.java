private void updateStatusBarPosition() {
    org.rstudio.studio.client.workbench.views.source.editors.text.ace.Position pos = docDisplay_.getCursorPosition();
    statusBar_.getPosition().setValue(((((pos.getRow()) + 1) + ":") + ((pos.getColumn()) + 1)));
    if (fileType_.canShowScopeTree())
        updateCurrentScope();
    
}