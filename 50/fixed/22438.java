@java.lang.Override
public javax.swing.JComponent createComponent() {
    myPanel = new org.jetbrains.plugins.terminal.TerminalSettingsPanel();
    return myPanel.createPanel(myOptionsProvider, myProjectOptionsProvider);
}