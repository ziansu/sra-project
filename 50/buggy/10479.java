@java.lang.Override
public com.laboki.eclipse.plugin.smartsave.instance.Instance begin() {
    this.startListening();
    com.laboki.eclipse.plugin.smartsave.preferences.ui.SaveIntervalButton.updateText();
    return super.begin();
}