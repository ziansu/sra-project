@java.lang.Override
public com.laboki.eclipse.plugin.smartsave.instance.Instance begin() {
    this.startListening();
    this.updateText();
    return super.begin();
}