public void profileSelection() {
    if (!(docDisplay_.isFocused())) {
        events_.fireEvent(new org.rstudio.studio.client.workbench.views.console.events.ConsoleExecutePendingInputEvent(commands_.profileCodeWithoutFocus().getId()));
        return ;
    }
    executeSelection(false, false, "profvis::profvis");
}