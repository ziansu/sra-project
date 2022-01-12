protected void manageSeparators() {
    separatorsInvalidated_ = false;
    new org.rstudio.core.client.widget.Toolbar.ToolbarSeparatorManager().manageSeparators(new org.rstudio.core.client.widget.Toolbar.ChildWidgetList(leftToolbarPanel_));
    new org.rstudio.core.client.widget.Toolbar.ToolbarSeparatorManager().manageSeparators(new org.rstudio.core.client.widget.Toolbar.ChildWidgetList(rightToolbarPanel_));
}