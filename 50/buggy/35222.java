@org.rstudio.core.client.command.Handler
public void onActivateTerminal() {
    if (!(uiPrefs_.showTerminalTab().getValue())) {
        uiPrefs_.showTerminalTab().setGlobalValue(true);
        uiPrefs_.writeUIPrefs();
    }
    view_.activateTerminal();
}